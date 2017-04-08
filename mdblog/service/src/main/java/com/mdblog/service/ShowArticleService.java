package com.mdblog.service;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;

/**
 * Created by Vincent on 16/10/31.
 */
public interface ShowArticleService {
    // 根据已发布文章id获取文章全部内容
    ResponResult getRaByRaId(Long RaId);
    // 根据已发布文章id获取文章主体文本内容
    String getRaContentByRaId(Long RaId);
}
