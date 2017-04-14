package com.mdblog.service.impl;

import com.mdblog.mapper.ArticleMapper;
import com.mdblog.mapper.CommentsMapper;
import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.mapper.UserLikeMapper;
import com.mdblog.po.CommentsExample;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ReleaseArticleExample;
import com.mdblog.po.UserLikeExample;
import com.mdblog.service.CountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/4/14.18:58.
 */
@Service("CountsServiceImpl")
public class CountsServiceImpl implements CountsService {

    @Autowired
    private ReleaseArticleMapper releaseArticleMapper;
    @Autowired
    private UserLikeMapper userLikeMapper;


    @Override
    public int fansCount(long uid) {
        UserLikeExample example = new UserLikeExample();
        UserLikeExample.Criteria criteria = example.createCriteria();
        criteria.andUlUid2EqualTo(uid);
        return userLikeMapper.countByExample(example);
    }

    @Override
    public int followerCount(long uid) {
        UserLikeExample example = new UserLikeExample();
        UserLikeExample.Criteria criteria = example.createCriteria();
        criteria.andUlUidEqualTo(uid);
        return userLikeMapper.countByExample(example);
    }

    @Override
    public int articleCount(long uid) {
        ReleaseArticleExample example = new ReleaseArticleExample();
        ReleaseArticleExample.Criteria criteria = example.createCriteria();
        criteria.andRaUidEqualTo(uid);
        criteria.andRaDelEqualTo(0);
        return releaseArticleMapper.countByExample(example);
    }

    // 本方法设计多表查询，影响性能，不计算用户总评论数
    @Override
    public int commentsCount(long uid) {
        return 0;
    }

    @Override
    public int likeCount(long uid) {
        return releaseArticleMapper.sumOfLike(uid);
    }
}
