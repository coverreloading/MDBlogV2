package com.mdblog.service.impl;

import com.mdblog.mapper.UserLikeMapper;
import com.mdblog.po.ResponResult;
import com.mdblog.po.User;
import com.mdblog.po.UserInfo;
import com.mdblog.po.UserLike;
import com.mdblog.service.FollowService;
import com.mdblog.service.UserInfoService;
import com.mdblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by loadi on 2017/2/17.
 */
@Service("FollowService")
public class FollowServiceImpl implements FollowService{

    @Autowired
    private UserLikeMapper userLikeMapper;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;

    // TODO: 2017/2/17 未测试 
    @Override
    public ResponResult addFollow(String token, Long uid) {
        UserLike userLike = new UserLike();
        Long id = userService.getUserIdByToken(token);
        if (id == -1) {
            return ResponResult.build(400, "重新登陆");
        }
        userLike.setUlCreatetime(System.currentTimeMillis());
        // 关注者
        userLike.setUlUid(id);
        // 被关注者
        userLike.setUlUid2(uid);

        try {
            UserInfo userInfo = userInfoService.getUserInfoByUid(uid);
            userLike.setUlPic(userInfo.getUiPic());
            userLike.setUlNickname(userInfo.getUiNickname());
            userLikeMapper.insert(userLike);
        } catch (Exception e) {
            return ResponResult.build(500,com.mdblog.common.utils.ExceptionUtil.getStackTrace(e));
        }
        return ResponResult.ok();
    }

    @Override
    public ResponResult removeFollow(String token, Long uid) {
        return null;
    }
}
