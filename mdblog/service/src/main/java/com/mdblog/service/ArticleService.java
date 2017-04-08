package com.mdblog.service;

import com.mdblog.po.Article;
import com.mdblog.po.ResponResult;

import java.io.UnsupportedEncodingException;

/**
 * Created by Vincent on 16/10/13.
 */

public interface ArticleService {
    // 所有token值均从前端传到后台，先判断redis中是否存在该信息，不存在即返回错误信息
    // 添加文章
    ResponResult addArticle(String token);
    // 获得指定id的文章内容
    ResponResult getArticle(String token, Long noteId);
    // 更新指定id的文章内容
    ResponResult updateArticle(String token, Article article) throws UnsupportedEncodingException;
    // 获取该用户所有笔记内容
    ResponResult getAllArticle(String token, int getFromRedis);
    // 删除指定id的文章
    ResponResult deleteArticle(String token, Long noteId);
}
