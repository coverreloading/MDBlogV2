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
        try {
            //查询商品列表
            List<SolrInsertItem> list = multiQueryMapper.solrInsert(days);
            //把商品信息写入索引库
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
                document.setField("RA_Text", item.getRA_Text());
                //写入索引库
                solrClient.add(document);
            }
            //提交修改
            solrClient.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
        return ResponResult.ok();
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
        query.addHighlightField("RA_Title");
        query.addHighlightField("RA_Text");
        query.addHighlightField("RA_Desc");
        query.setHighlightSimplePre("<em style=\"color:red\">");
        query.setHighlightSimplePost("</em>");
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
        //商品列表
        List<SolrInsertItem> itemList = new ArrayList<>();
        //取高亮显示
        Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
        //取商品列表
        for (SolrDocument solrDocument : solrDocumentList) {
            //创建一商品对象
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
            //添加的商品列表
            itemList.add(item);
        }
        result.setItemList(itemList);
        return result;
    }
}
