package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;

/**
 * Created by loadi on 2016/11/8.
 */
public interface UserInfoService {
    // 根据用户id获取用户详细信息
    UserInfo getUserInfoByUid(long uid);
    // 根据用户token获取用户详细信息，用于校验用户操作是否合法
    ResponResult getUserInfoByToken(String token);
    // 更新用户信息
    ResponResult updateUserInfo(String token, UserInfo userInfo);
}
