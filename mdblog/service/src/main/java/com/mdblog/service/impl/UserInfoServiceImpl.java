package com.mdblog.service.impl;

import com.mdblog.common.utils.ExceptionUtil;
import com.mdblog.mapper.UserInfoMapper;
import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;
import com.mdblog.po.UserInfoExample;
import com.mdblog.service.UserInfoService;
import com.mdblog.service.UserService;
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
    @Autowired
    private UserService userService;

    @Override
    public UserInfo getUserInfoByUid(long Uid) {
        /*
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUiUidEqualTo(Uid);
        List<UserInfo> list = userInfoMapper.selectByExample(userInfoExample);
        return list.get(0);
        */
        return userInfoMapper.selectByPrimaryKey(Uid);
    }

    @Override
    public ResponResult getUserInfoByToken(String token)  {
        try {
            UserInfo userInfo = getUserInfoByUid(userService.getUserIdByToken(token));
            if (userInfo == null) {
                return ResponResult.build(404, "not found");
            }
            return ResponResult.ok(userInfo);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return ResponResult.build(500, "something wrong");
        }
    }

    /**
     * 用户信息保存
     * @param token
     * @param userInfo
     * @return
     */
    @Override
    public ResponResult updateUserInfo(String token, UserInfo userInfo) {
        // 验证
        //System.out.println("token=" + token);

        long uid = userService.getUserIdByToken(token);
        if (uid == -1) {
            return ResponResult.build(400, "用户登陆过期");
        }
        userInfo.setUiUid(uid);

        try {
            System.out.println("用户详细信息为" + userInfo.toString());

            UserInfoExample userInfoExample = new UserInfoExample();
            UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
            criteria.andUiUidEqualTo(uid);
            List<UserInfo> userInfotemp = userInfoMapper.selectByExample(userInfoExample);
            if (userInfotemp.size() == 0) {
                userInfo.setUiCreatetime(System.currentTimeMillis());
                userInfo.setUiDel(0);
                userInfoMapper.insert(userInfo);
            } else {
                userInfoMapper.updateByPrimaryKeySelective(userInfo);
            }
            return ResponResult.ok();
        } catch (Exception e) {
            System.out.println(ExceptionUtil.getStackTrace(e));
            return ResponResult.build(500, "保存失败 , 请稍候重试");
        }
    }
}
