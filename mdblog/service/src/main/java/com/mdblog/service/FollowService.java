package com.mdblog.service;

import com.mdblog.po.ResponResult;

/**
 * Created by loadi on 2017/2/17.
 */
public interface FollowService {
    // 添加关注
    ResponResult addFollow(String token, Long uid);
    // 取消关注
    ResponResult removeFollow(String token, Long uid);
    // 检查是否已经关注
    ResponResult checkFollow(String token, Long uid);
    // 获取关注用户列表
    ResponResult getFollowList(String token);
}
