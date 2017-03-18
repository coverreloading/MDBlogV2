package com.mdblog.service;

import com.mdblog.po.ResponResult;
import dto.SearchResult;
import dto.SolrInsertItem;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.13:44.
 */
public interface SolrService {
    // read-only
    ResponResult solrInsert(Integer days);
    SearchResult search(String queryString, int page, int rows) throws Exception;
}
