package com.mdblog.service;

import com.mdblog.po.Article;
import com.mdblog.po.ResponResult;

/**
 * Created by Vincent on 16/10/13.
 */

public interface ArticleService {
    ResponResult addArticle(String token);
    ResponResult getArticle(String token, Long noteId);
    ResponResult updateArticle(String token, Article article);
    ResponResult getAllArticle(String token, int getFromRedis);
    ResponResult deleteArticle(String token, Long noteId);
}
