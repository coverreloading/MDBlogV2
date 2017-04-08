package com.mdblog.service;

import com.mdblog.po.ResponResult;

/**
 * Created by loadi on 2017/2/17.
 */
public interface ManageReadLikeCount {
    // 更新文章阅读数和点赞数，从redis中取值保存到数据库中
    ResponResult updateCount();
}
