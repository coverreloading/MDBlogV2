package com.mdblog.service;

import com.mdblog.po.ResponResult;
import dto.SearchResult;
import dto.SolrInsertItem;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.13:44.
 */
public interface SolrService {
    // 更新最近多少天发布文章的solr缓存，以距今多少天为标准
    ResponResult solrInsert(Integer days);
    // solr搜索服务
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
