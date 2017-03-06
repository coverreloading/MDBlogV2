package com.mdblog.service;

import com.mdblog.po.Comments;
import com.mdblog.po.ResponResult;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/5.12:35.
 */
public interface CommentService {

    ResponResult add(String token,Comments comments);

    ResponResult remove(String token,Comments comments);

    // 分页
    List<Comments> getParents(Long raId, Long page, Long num);
}
