package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.ReleaseArticle;

/**
 * Created by Vincent on 16/10/30.
 */
public interface ReleaseArticleService {
    ResponResult checkExitRA(String token, Long aId);
    ResponResult addRA(String token, Long aId, String tipJson, ReleaseArticle releaseArticle);
    ResponResult removeRA(String token, Long aId);
    ResponResult addLike(Long raId);
    ResponResult removeLike(Long raId);
}
