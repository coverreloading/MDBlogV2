package com.mdblog.mapper;

import dto.SolrInsertItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.11:38.
 */
public interface MultiQueryMapper {
    // 选择最近多少天更新的文章
    List<SolrInsertItem> solrInsert(@Param("days")Integer days);
}
