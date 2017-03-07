package com.mdblog.service;

import com.mdblog.po.Comments;
import com.mdblog.po.ResponResult;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/5.12:35.
 */
public interface CommentService {

    ResponResult add(String token,Comments comments);

    // 分页
    // 根据文章id获取首层评论
    List<Comments> getParents(Long raId, Long page, Long num);

    // 根据首层评论id获取楼中楼
    List<Comments> getChildren(Long pId, Long page, Long num);
    int getChildrenCount(Long pId);

    int getParentsCount(Long raId);

    ResponResult removeComments(String token,Long cId);
}
