package com.mdblog.service;

import com.mdblog.po.ReleaseArticle;

import java.util.List;

/**
 * Created by loadi on 2017/2/19.
 */
public interface GetHotArticleService {
    List<ReleaseArticle> getByNum(int page, int num);
}
