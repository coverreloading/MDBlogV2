package com.mdblog.service.impl;

import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.po.JedisClient;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.service.ShowArticleService;
import com.mdblog.common.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

/**
 * Created by Vincent on 16/10/31.
 */
@Service("ShowArticleService")
public class ShowArticleServiceImpl implements ShowArticleService {

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
    public ResponResult getRaByRaId(Long RaId) {
        String baseKey = REDIS_RA_SESSION_KEY + ":" + RaId;
        String readKey = baseKey + ":read";
        String likeKey = baseKey + ":like";

        ReleaseArticle releaseArticle = new ReleaseArticle();
        releaseArticle = JsonUtils.jsonToPojo(jedisClient.get(baseKey), ReleaseArticle.class);

        // redis中取RA, 不为空即更新时间和read,返回对象
        if (releaseArticle != null) {
            jedisClient.incr(readKey);
            releaseArticle.setRaRead(Long.valueOf(jedisClient.get(readKey)));
            releaseArticle.setRaLike(Long.valueOf(jedisClient.get(likeKey)));
            jedisClient.expire(baseKey, RA_EXPIRE);
            jedisClient.expire(readKey, RA_RAndL_EXPIRE);
            jedisClient.expire(likeKey, RA_RAndL_EXPIRE);
            return ResponResult.ok(releaseArticle);
        }
        // 为空即查询数据库,文章插入redis,更新时间
        releaseArticle = releaseArticleMapper.selectByPrimaryKeyWithBLOBs(RaId);
        if (releaseArticle == null || releaseArticle.getRaDel()==1) {
            return ResponResult.build(404, "wrong Id , no such article");
        }
        jedisClient.set(baseKey, JsonUtils.objectToJson(releaseArticle));
        jedisClient.expire(baseKey, RA_EXPIRE);
        // 再查read是否为空, 不为空,将取到的值代入,再取like的值,代入,更新时间,返回对象
        String tempint = jedisClient.get(likeKey);
        if (tempint != null) {
            releaseArticle.setRaRead(Long.valueOf(jedisClient.get(readKey)));
            releaseArticle.setRaLike(Long.valueOf(tempint));
            jedisClient.expire(baseKey, RA_EXPIRE);
            jedisClient.expire(readKey, RA_RAndL_EXPIRE);
            jedisClient.expire(likeKey, RA_RAndL_EXPIRE);
            return ResponResult.ok(releaseArticle);
        }
        // 全为空,添加新值,刷新时间
        jedisClient.set(readKey, String.valueOf(releaseArticle.getRaRead()));
        jedisClient.set(likeKey, String.valueOf(releaseArticle.getRaLike()));
        jedisClient.expire(readKey, RA_RAndL_EXPIRE);
        jedisClient.expire(likeKey, RA_RAndL_EXPIRE);
        return ResponResult.ok(releaseArticle);
    }

    @Override
    public String getRaContentByRaId(Long RaId) {
        String raText = releaseArticleMapper.selectContentByPrimaryKey(RaId).getRaText();
        if (StringUtils.isEmpty(raText)) {
            return "没有找到该文章";
        }
        return raText;
    }
}
