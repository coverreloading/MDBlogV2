package com.mdblog.service.impl;

import com.mdblog.mapper.ArticleMapper;
import com.mdblog.mapper.ArticleTipsMapper;
import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.mapper.UserMapper;
import com.mdblog.po.*;
import com.mdblog.service.ReleaseArticleService;
import com.mdblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vincent on 16/10/30.
 */
@Service("ReleaseArticleService")
public class ReleaseArticleServiceImpl implements ReleaseArticleService {

    @Autowired
    private UserService userService;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ReleaseArticleMapper releaseArticleMapper;

    @Autowired
    private JedisClient jedisClient;
    @Value("${REDIS_RA_SESSION_KEY}")
    String REDIS_RA_SESSION_KEY;
    //笔记的过期时间60分钟
    @Value("${RA_EXPIRE}")
    Integer RA_EXPIRE;
    //笔记的阅读量,喜欢数过期时间24小时
    @Value("${RA_RAndL_EXPIRE}")
    Integer RA_RAndL_EXPIRE;

    @Override
    public ResponResult checkExitRA(String token, Long aId) {
        long UID = userService.getUserIdByToken(token);
        if (UID == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        ReleaseArticleExample example = new ReleaseArticleExample();
        ReleaseArticleExample.Criteria criteria = example.createCriteria();
        criteria.andRaArticleIdEqualTo(aId);
        criteria.andRaDelEqualTo(0);
        List<ReleaseArticle> list = releaseArticleMapper.selectByExample(example);
        if (list.size() == 0 ) {
            return ResponResult.build(400, "haven't release");
        }
        ReleaseArticle releaseArticle = list.get(0);
        return ResponResult.build(200, String.valueOf(releaseArticle.getRaId()));
    }

    @Override
    public ResponResult addRA(String token, Long articleId, String tipJson, ReleaseArticle releaseArticle) {

        long UID = userService.getUserIdByToken(token);
        if (UID == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        Article article = articleMapper.selectByPrimaryKey(articleId);
        // 用户token与文章的UID对应不上
        if (article.getaUid() != UID) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        releaseArticle.setRaArticleId(articleId);
        releaseArticle.setRaUid(UID);
        releaseArticle.setRaPic(article.getaPic());
        releaseArticle.setRaCreatetime(System.currentTimeMillis());
        releaseArticle.setRaUpdatetime(System.currentTimeMillis());
        releaseArticle.setRaDel(0);
        releaseArticle.setRaRead((long) 0);
        releaseArticle.setRaLike((long) 0);

        try {
            releaseArticleMapper.insertAndGetId(releaseArticle);
            return ResponResult.ok(releaseArticle.getRaId());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, "insert error");
        }
        // TODO: 2017/2/23 tip保存方式有毒
        /*
        ArticleTips articleTips = new ArticleTips();
        articleTips.setAtRaId(releaseArticle.getRaId());
        articleTips.setAtUid(UID);
        articleTips.setAtCreatetime(System.currentTimeMillis());
        String[] str = tipJson.split(",");
        for(int i= 0;i<str.length;i++) {
            articleTips.setAtTipname(str[i]);
        }
        */


    }

    @Override
    public ResponResult removeRA(String token, Long aId) {
        // 校验是否存在
        ResponResult result = checkExitRA(token, aId);
        if (result.getStatus() != 200) {
            return result;
        }
        Long RaId = Long.valueOf(result.getMsg());

        String baseKey = REDIS_RA_SESSION_KEY + ":" + RaId;
        String readKey = baseKey + ":read";
        String likeKey = baseKey + ":like";


        // 删除文章 (添加删除标识)
        ReleaseArticle ra = new ReleaseArticle();
        ra.setRaId(RaId);
        ra.setRaDel(1);
        releaseArticleMapper.updateByPrimaryKeySelective(ra);
        // 清空redis
        if (jedisClient.exits(baseKey)) {
            jedisClient.del(baseKey);
        }
        if (jedisClient.exits(readKey)) {
            jedisClient.del(readKey);
        }
        if (jedisClient.exits(likeKey)) {
            jedisClient.del(likeKey);
        }
        return ResponResult.ok();
    }

    @Override
    public ResponResult addLike(Long raId) {
        String baseKey = REDIS_RA_SESSION_KEY + ":" + raId;
        String likeKey = baseKey + ":like";
        jedisClient.incr(likeKey);
        return ResponResult.ok();
    }

    @Override
    public ResponResult removeLike(Long raId) {
        String baseKey = REDIS_RA_SESSION_KEY + ":" + raId;
        String likeKey = baseKey + ":like";
        jedisClient.decr(likeKey);
        return ResponResult.ok();
    }
}
