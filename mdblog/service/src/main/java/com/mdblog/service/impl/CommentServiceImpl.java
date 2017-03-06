package com.mdblog.service.impl;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.mdblog.mapper.CommentsMapper;
import com.mdblog.po.Comments;
import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;
import com.mdblog.service.CommentService;
import com.mdblog.service.UserInfoService;
import com.mdblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;
import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/5.12:39.
 */
@Service("CommentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentsMapper commentsMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;

    // TODO: 2017/3/5  后续可加缓存


    @Override
    public ResponResult add(String token, Comments comments) {
        UserInfo info = (UserInfo)userInfoService.getUserInfoByToken(token).getData();
        if (info == null) {
            return ResponResult.build(400, "wrong token");
        }
        // 普通参数
        comments.setcCreatetime(System.currentTimeMillis());
        comments.setcDel(0);
        comments.setcUid(info.getUiUid());
        comments.setcUNickname(info.getUiNickname());
        comments.setcUPic(info.getUiPic());

        // 普通评论 已有参数包括:cRaid,cContent;  cParentid,cUid2为空
        if (comments.getcParentid() == null || comments.getcUid2() == null) {
            comments.setcParentid(Long.valueOf(0));
            comments.setcUid2(Long.valueOf(0));
            comments.setcUNickname2("no user2");
            try {
                commentsMapper.insert(comments);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ResponResult.ok(comments);
        }
        // 回复评论 已有参数包括:cRaid,cContent,cParentid,cUid2
        comments.setcUNickname2(userInfoService.getUserInfoByUid(comments.getcUid2()).getUiNickname());
        commentsMapper.insert(comments);
        return ResponResult.ok(comments);
    }

    @Override
    public ResponResult remove(String token, Comments comments) {
        return null;
    }

    @Override
    public List<Comments> getParents(Long raId, Long page, Long num) {
        return commentsMapper.selectParentByRaid(raId, page, num);
    }

    @Override
    public List<Comments> getChildren(Long pId, Long page, Long num) {
        return commentsMapper.selectChildByParentId(pId, page, num);
    }
}
