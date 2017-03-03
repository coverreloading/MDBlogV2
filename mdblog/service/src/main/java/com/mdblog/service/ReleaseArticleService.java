package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.ReleaseArticle;

/**
 * Created by Vincent on 16/10/30.
 */
public interface ReleaseArticleService {
    ResponResult addRA(String token, Long articleId, String tipJson, ReleaseArticle releaseArticle);
    ResponResult addLike(Long raId);
    ResponResult removeLike(Long raId);
}
