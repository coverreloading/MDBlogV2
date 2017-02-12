package com.mdblog.service.impl;

import com.mdblog.mapper.UserInfoMapper;
import com.mdblog.mapper.UserMapper;
import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;
import com.mdblog.po.UserInfoExample;
import com.mdblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by loadi on 2016/11/8.
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoByUid(long Uid) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUiUidEqualTo(Uid);
        List<UserInfo> list = userInfoMapper.selectByExample(userInfoExample);
        return list.get(0);
    }

    @Override
    public ResponResult updateUserInfo(String token, UserInfo userInfo) {
        // TODO: 2017/2/12
        return null;
    }
}
