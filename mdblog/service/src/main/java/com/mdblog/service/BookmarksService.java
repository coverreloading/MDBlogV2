package com.mdblog.service;

import com.mdblog.po.ResponResult;

/**
 * Created by loadi on 2017/3/1.
 */

public interface BookmarksService {
    // 添加收藏
    ResponResult add(String token, Long aid);
    // 删除收藏
    ResponResult delete(String token, Long aid);
    // 检查是否已经收藏
    ResponResult check(String token, Long aid);
    // 获取用户收藏夹
    ResponResult getBookmark(String token, long page, long num);
}
