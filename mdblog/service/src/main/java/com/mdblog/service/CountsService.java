package com.mdblog.service;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/4/14.18:58.
 */
public interface CountsService {
    int fansCount(long uid);

    int followerCount(long uid);

    int articleCount(long uid);

    int commentsCount(long uid);

    int likeCount(long uid);
}
