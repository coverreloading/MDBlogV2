package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.ReleaseArticle;

/**
 * Created by Vincent on 16/10/30.
 */
public interface ReleaseArticleService {
    // 检查该文章是否已经发布
    ResponResult checkExitRA(String token, Long aId);
    // 发布文章
    ResponResult addRA(String token, Long aId, String tipJson, ReleaseArticle releaseArticle);
    // 取消发布
    ResponResult removeRA(String token, Long aId);
    // 点赞
    ResponResult addLike(Long raId);
    // 取消赞
    ResponResult removeLike(Long raId);
}
