package com.mdblog.service.impl;

import com.mdblog.mapper.UserLikeMapper;
import com.mdblog.po.*;
import com.mdblog.service.FollowService;
import com.mdblog.service.UserInfoService;
import com.mdblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.List;

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

    /**
     * 确认是否已经关注
     * @param token
     * @param uid
     * @return
     */
    @Override
    public ResponResult checkFollow(String token, Long uid) {
        Long id = userService.getUserIdByToken(token);
        if (id == -1) {
            return ResponResult.build(400, "重新登陆");
        }
        // 需先查找数据库确定是否已有对应数据,防止重复插入
        if (userLikeMapper.checkExit(id, uid).size()!=0) {
            return ResponResult.build(401, "已经关注");
        }
        return ResponResult.ok();
    }

    /**
     * 添加关注
     * @param token
     * @param uid
     * @return
     */
    @Override
    public ResponResult addFollow(String token, Long uid) {
        UserLike userLike = new UserLike();
        Long id = userService.getUserIdByToken(token);
        if (id == -1) {
            return ResponResult.build(400, "重新登陆");
        }
        // 需先查找数据库确定是否已有对应数据,防止重复插入
        if (userLikeMapper.checkExit(id, uid).size()!=0) {
            System.out.println("差点重复插入");
            return ResponResult.build(400, "已经关注");
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

    /**
     * 取消关注
     * @param token
     * @param uid
     * @return
     */
    @Override
    public ResponResult removeFollow(String token, Long uid) {
        UserLike userLike = new UserLike();

        Long id = userService.getUserIdByToken(token);
        if (id == -1) {
            return ResponResult.build(400, "重新登陆");
        }
        List<Long> list = userLikeMapper.checkExit(id, uid);
        // 需先查找数据库确定是否已有对应数据,防止重复插入
        if (list.size()==0) {
            System.out.println("没有对应数据可以删除");
            return ResponResult.build(400, "还没关注");
        }
        try {
            System.out.println(userLikeMapper.deleteByPrimaryKey(list.get(0))+"号位关注记录被删除");
        } catch (Exception e) {
            return ResponResult.build(500,com.mdblog.common.utils.ExceptionUtil.getStackTrace(e));
        }
        return ResponResult.ok();
    }


}
