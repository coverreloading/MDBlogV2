package com.mdblog.service.impl;

import com.mdblog.mapper.UserInfoMapper;
import com.mdblog.po.UserInfo;
import com.mdblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by loadi on 2016/11/8.
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(long Uid) {
        // TODO
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(Uid);
        return userInfo;
    }
}
