package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;

/**
 * Created by loadi on 2016/11/8.
 */
public interface UserInfoService {
    UserInfo getUserInfoByUid(long Uid);
    ResponResult updateUserInfo(String token, UserInfo userInfo);
}
