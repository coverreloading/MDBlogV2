package com.mdblog.service.impl;

import com.mdblog.mapper.ArticleMapper;
import com.mdblog.mapper.ArticleMapper;
import com.mdblog.po.Article;
import com.mdblog.po.JedisClient;
import com.mdblog.po.Article;
import com.mdblog.po.ArticleExample;
import com.mdblog.po.ResponResult;
import com.mdblog.service.ArticleService;
import com.mdblog.service.UserService;
import com.mdblog.common.utils.JsonUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vincent on 16/10/17.
 */
@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private UserService userService;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private JedisClient jedisClient;
    // 用户session在redis中保存的key
    @Value("${REDIS_USER_SESSION_KEY}")
    private String REDIS_USER_SESSION_KEY;
    // 文章session在redis中保存的key
    @Value("${REDIS_ARTICLE_SESSION_KEY}")
    private String REDIS_ARTICLE_SESSION_KEY;
    //  Session的过期时间
    @Value("${SSO_SESSION_EXPIRE}")
    private Integer SSO_SESSION_EXPIRE;
    @Value("${DEFAULT_ARTICLE_CONTENT}")
    private String DEFAULT_ARTICLE_CONTENT;

    @Override
    public ResponResult addArticle(String token) {
        Long userId = userService.getUserIdByToken(token);
        if (userId == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        Article article = new Article();
        article.setaUid(userId);
        // 旧版 date
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        //article.setaTitle(format.format(new Date()));
        // joda date
        article.setaTitle(new DateTime().toString("/yyyy/MM/dd HH:MM:ss"));
        article.setaCreatetime(System.currentTimeMillis());
        article.setaUpdatetime(System.currentTimeMillis());
        article.setaText(DEFAULT_ARTICLE_CONTENT);
        article.setaDel(0);
        articleMapper.insertAndGetId(article);
        // 存入redis
        jedisClient.set(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + article.getaId(), JsonUtils.objectToJson(article));
        // 更新redis时间
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + article.getaId(), SSO_SESSION_EXPIRE);
        jedisClient.expire(REDIS_USER_SESSION_KEY+":" + token, SSO_SESSION_EXPIRE);
        return ResponResult.ok(article);
    }


    @Override
    public ResponResult getArticle(String token, Long articleId) {
        // token过期判定
        Long userId = userService.getUserIdByToken(token);
        if (userId == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        Article article = new Article();
        // 1. redis查询token获取userid
        String json = jedisClient.get(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + articleId);
        // 非空判定
        if (org.apache.commons.lang3.StringUtils.isNotBlank(json)) {
            article = JsonUtils.jsonToPojo(json, Article.class);
        }else{
            // 2. 直接查数据库
            article = articleMapper.selectByPrimaryKey(articleId);
        }
        // token对应用户id与文章的UID不一致
        if (article.getaUid() != userId) {
            return ResponResult.build(400, "又一个搞事的");
        }
        // 直接查数据库需要更新redis
        jedisClient.set(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + articleId, JsonUtils.objectToJson(article));

        // 更新session时效
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + articleId, SSO_SESSION_EXPIRE);
        return ResponResult.ok(article);
    }

    @Override
    public ResponResult updateArticle(String token, Article article) {
        // 接受token查询userId结果
        Long userId = userService.getUserIdByToken(token);
        if (userId == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        // 用户token与文章的UID对应不上
        if (article.getaUid() != userId) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }

        Article articleFromDB = articleMapper.selectByPrimaryKey(article.getaId());
        if(articleFromDB==null){
            return ResponResult.build(400,"没有指定保存的文章");
        }
        String[] text = article.getaText().split("\n");
        articleFromDB.setaTitle(text[0]);
        articleFromDB.setaUpdatetime(System.currentTimeMillis());
        articleFromDB.setaText(article.getaText());

        articleMapper.updateByPrimaryKeyWithBLOBs(articleFromDB);
        // 存入redis
        jedisClient.set(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + article.getaId(), JsonUtils.objectToJson(articleFromDB));
        // 更新redis时间
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + article.getaId(), SSO_SESSION_EXPIRE);
        return ResponResult.ok();
    }

    @Override
    public ResponResult getAllArticle(String token, int getFromRedis) {
        Long UID = userService.getUserIdByToken(token);
        if (UID == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        List<Article> list = new ArrayList<>();
        // redis 中获取
        if (getFromRedis == 1) {
            List<Long> ids = articleMapper.selectIdListByUserId(UID);
            for (Long id : ids) {
                //System.out.println(id);
                list.add(JsonUtils.jsonToPojo(jedisClient.get(REDIS_USER_SESSION_KEY +":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + id), Article.class));
            }
        } else if (getFromRedis == 0) {
            // ArticleExample 查询所有userid==userid的文章
            ArticleExample example = new ArticleExample();
            ArticleExample.Criteria criteria = example.createCriteria();
            criteria.andAUidEqualTo(UID);
            list = articleMapper.selectByExampleWithBLOBs(example);
            if (list == null || list.size() == 0) {
                return ResponResult.build(500, "没有文章");
            }
            for (Article article : list) {
                // 存入redis
                jedisClient.set(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + article.getaId(), JsonUtils.objectToJson(article));
                // 更新redis时间
                jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + article.getaId(), SSO_SESSION_EXPIRE);
            }
        }
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
        return ResponResult.ok(list);
    }

    @Override
    public ResponResult deleteArticle(String token, Long articleId) {
        // token过期判定
        Long userId = userService.getUserIdByToken(token);
        if (userId == -1) {
            return ResponResult.build(401, "session已过期,请重新登录");
        }
        Article article = new Article();
        // 1. redis查询token获取userid
        String json = jedisClient.get(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + articleId);
        // 非空判定
        if (org.apache.commons.lang3.StringUtils.isNotBlank(json)) {
            article = JsonUtils.jsonToPojo(json, Article.class);
        }else{
            // 2. 直接查数据库
            article = articleMapper.selectByPrimaryKey(articleId);
        }
        if(article==null){
            return ResponResult.build(400, "这个文章已经被删除了");
        }
        // token对应用户id与文章的UID不一致
        if (article.getaUid() != userId) {
            return ResponResult.build(400, "又一个搞事的");
        }
        articleMapper.deleteByPrimaryKey(articleId);
        // 直接查数据库需要更新redis
        jedisClient.del(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + articleId);

        // 更新session时效
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+REDIS_ARTICLE_SESSION_KEY + ":" + token + ":" + articleId, SSO_SESSION_EXPIRE);
        return ResponResult.ok(article);
    }
}
