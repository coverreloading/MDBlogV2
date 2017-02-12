package com.mdblog.service;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;

/**
 * Created by Vincent on 16/10/31.
 */
public interface ShowArticleService {
    ResponResult getRaByRaId(Long RaId);
    String getRaContentByRaId(Long RaId);
}
