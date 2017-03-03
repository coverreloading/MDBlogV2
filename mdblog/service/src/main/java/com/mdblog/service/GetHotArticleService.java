package com.mdblog.service;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;

import java.util.List;

/**
 * Created by loadi on 2017/2/19.
 */
public interface GetHotArticleService {
    // 获取一定数量文章
    List<ReleaseArticle> getByNum(int page, int num);
    // 根据用户id获取一定数量文章
    List<ReleaseArticle> getHotByUid(Long uid, Long page, Long num);
    // 根据专题id获取一定数量文章
    List<ReleaseArticle> getSubjectlist(Long subid, long page, long num);
}
