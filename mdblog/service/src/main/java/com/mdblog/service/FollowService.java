package com.mdblog.service;

import com.mdblog.po.ResponResult;

/**
 * Created by loadi on 2017/2/17.
 */
public interface FollowService {
    ResponResult addFollow(String token, Long uid);
    ResponResult removeFollow(String token, Long uid);
}
