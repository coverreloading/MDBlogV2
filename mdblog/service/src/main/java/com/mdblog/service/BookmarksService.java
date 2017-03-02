package com.mdblog.service;

import com.mdblog.po.ResponResult;

/**
 * Created by loadi on 2017/3/1.
 */

public interface BookmarksService {
    ResponResult add(String token, Long aid);
    ResponResult delete(String token, Long aid);
    ResponResult check(String token, Long aid);
    // 获取用户收藏夹
    ResponResult getBookmark(String token, long page, long num);
}
