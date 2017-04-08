package com.mdblog.service.impl;

import com.mdblog.common.utils.ExceptionUtil;
import com.mdblog.mapper.MultiQueryMapper;
import com.mdblog.po.ResponResult;
import com.mdblog.service.SolrService;
import dto.SearchResult;
import dto.SolrInsertItem;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.13:45.
 */
@Service("SolrService")
public class SolrServiceImpl implements SolrService {

    //创建一连接
    @Autowired
    private HttpSolrClient solrClient;
    @Autowired
    private MultiQueryMapper multiQueryMapper;

    @Override
    public ResponResult solrInsert(Integer days) {
        long startTime = System.currentTimeMillis();
        try {
            //查询整个列表
            List<SolrInsertItem> list = multiQueryMapper.solrInsert(days);
            /*
            //定义script的正则表达式
            String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>";
            //定义style的正则表达式
            String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>";
            */
            //定义HTML标签的正则表达式
            String regEx_html="<[^>]+>";
            /*
            Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
            Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
            */
            Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
            //String tempText = null;
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();

            //把item信息写入索引库
            for (SolrInsertItem item : list) {
                //创建一个SolrInputDocument对象
                SolrInputDocument document = new SolrInputDocument();
                document.setField("UI_UID", item.getUI_UID());
                document.setField("UI_Nickname", item.getUI_Nickname());
                document.setField("UI_Pic", item.getUI_Pic());
                document.setField("UI_Sex", item.getUI_Sex());
                document.setField("id", item.getRA_ID());
                document.setField("RA_Title", item.getRA_Title());
                document.setField("RA_Pic", item.getRA_Pic());
                document.setField("RA_Desc", item.getRA_Desc());
                document.setField("RA_Read", item.getRA_Read());
                document.setField("RA_Like", item.getRA_Like());

                //tempText = item.getRA_Text();
                /*
                //过滤script标签
                Matcher m_script=p_script.matcher(tempText);
                tempText=m_script.replaceAll("");
                //过滤style标签
                Matcher m_style=p_style.matcher(tempText);
                tempText=m_style.replaceAll("");
                */
                /*
                //过滤html标签
                Matcher m_html=p_html.matcher(tempText);
                tempText=m_html.replaceAll("");
                //返回文本字符串
                document.setField("RA_Text",tempText.trim());
                */
                sb1.append(item.getRA_Text());
                Matcher m_html = p_html.matcher(sb1);
                sb2.delete(0,sb1.length()-1);
                sb2.append(m_html.replaceAll(""));
                document.setField("RA_Text",sb2);
                //写入索引库
                solrClient.add(document);
            }
            //提交修改
            solrClient.commit();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
        return ResponResult.ok("耗时"+ (System.currentTimeMillis()-startTime)+"ms");
    }

    @Override
    public SearchResult search(String queryString, int page, int rows) throws Exception {
        //创建查询对象
        //queryString = "阅读器";
        //page = 1;
        //rows = 5;
        SolrQuery query = new SolrQuery();
        //设置查询条件
        query.setQuery(queryString);
        //设置分页
        query.setStart((page - 1) * rows);
        query.setRows(rows);
        //设置默认搜素域
        query.set("df", "item_keywords");

        //设置高亮显示
        query.setHighlight(true);
        //query.addHighlightField("RA_Title");
        query.addHighlightField("item_keywords");
        //query.addHighlightField("RA_Desc");
        query.setHighlightSimplePre("<font color='red'>");//标记，高亮关键字前缀
        query.setHighlightSimplePost("</font>");//后缀
        query.setHighlightSnippets(1);//结果分片数，默认为1
        query.setHighlightFragsize(100);//每个分片的最大长度，

        //执行查询
        SearchResult searchResult = search(query);
        //计算查询结果总页数
        long recordCount = searchResult.getRecordCount();
        long pageCount = recordCount / rows;
        if (recordCount % rows > 0) {
            pageCount++;
        }
        searchResult.setPageCount(pageCount);
        searchResult.setCurPage(page);
        return searchResult;
    }

    private SearchResult search(SolrQuery query) throws Exception {
        //返回值对象
        SearchResult result = new SearchResult();
        //根据查询条件查询索引库
        QueryResponse queryResponse = solrClient.query(query);
        //取查询结果
        SolrDocumentList solrDocumentList = queryResponse.getResults();
        //取查询结果总数量
        result.setRecordCount(solrDocumentList.getNumFound());
        //列表
        List<SolrInsertItem> itemList = new ArrayList<>();
        //取高亮显示
        Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
        //取列表
        for (SolrDocument solrDocument : solrDocumentList) {
            //创建一对象
            SolrInsertItem item = new SolrInsertItem();
            item.setRA_ID(Long.valueOf(solrDocument.get("id").toString()));
            //取高亮显示的结果
            List<String> list = highlighting.get(solrDocument.get("id")).get("RA_Title");
            String title = "";
            if (list != null && list.size() > 0) {
                title = list.get(0);
            } else {
                title = (String) solrDocument.get("RA_Title");
            }
            item.setRA_Title(title);
            item.setUI_Nickname((String) solrDocument.get("UI_Nickname"));
            item.setUI_Pic((String) solrDocument.get("UI_Pic"));
            item.setUI_Sex((String) solrDocument.get("UI_Sex"));
            item.setRA_Title((String) solrDocument.get("RA_Title"));
            item.setRA_Pic((String) solrDocument.get("RA_Pic"));
            item.setRA_Desc((String) solrDocument.get("RA_Desc"));
            item.setRA_Read((Long) solrDocument.get("RA_Read"));
            item.setRA_Like((Long) solrDocument.get("RA_Like"));
            item.setRA_Text((String) solrDocument.get("RA_Text"));
            //添加item列表
            itemList.add(item);
        }
        result.setItemList(itemList);
        return result;
    }
}
