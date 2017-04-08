package com.mdblog.service;

import com.mdblog.po.Comments;
import com.mdblog.po.ResponResult;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/5.12:35.
 */
public interface CommentService {
    // 新增评论
    ResponResult add(String token,Comments comments);
    // 分页
    // 根据文章id获取首层评论
    List<Comments> getParents(Long raId, Long page, Long num);
    // 根据首层评论id获取楼中楼
    List<Comments> getChildren(Long pId, Long page, Long num);
    // 获取指定楼层楼中楼个数，用于分页
    int getChildrenCount(Long pId);
    // 获取首层回复总个数，用于分页
    int getParentsCount(Long raId);
    // 删除评论
    ResponResult removeComments(String token,Long cId);
}
