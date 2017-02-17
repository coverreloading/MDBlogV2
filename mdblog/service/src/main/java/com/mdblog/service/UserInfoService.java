package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;

/**
 * Created by loadi on 2016/11/8.
 */
public interface UserInfoService {
    UserInfo getUserInfoByUid(long uid);
    ResponResult getUserInfoByToken(String token);
    ResponResult updateUserInfo(String token, UserInfo userInfo);
}
