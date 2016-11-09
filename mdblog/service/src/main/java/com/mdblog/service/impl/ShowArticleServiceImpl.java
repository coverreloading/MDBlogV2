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
    public ReleaseArticle getRaByRaId(Long RaId) {
        ReleaseArticle releaseArticle = new ReleaseArticle();
        releaseArticle = JsonUtils.jsonToPojo(jedisClient.get(REDIS_RA_SESSION_KEY+":"+RaId),ReleaseArticle.class);
        // redis中取RA, 不为空即更新时间和read,返回对象
        if (releaseArticle!=null){
            jedisClient.incr(REDIS_RA_SESSION_KEY+":"+RaId+":read");
            releaseArticle.setRaRead(Long.valueOf(jedisClient.get(REDIS_RA_SESSION_KEY+":"+RaId+":read")));
            releaseArticle.setRaLike(Long.valueOf(jedisClient.get(REDIS_RA_SESSION_KEY+":"+RaId+":like")));
            jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId,RA_EXPIRE);
            jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId+":read",RA_RAndL_EXPIRE);
            jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId+":like",RA_RAndL_EXPIRE);
            return releaseArticle;
        }
        // 为空即查询数据库,文章插入redis,更新时间
        releaseArticle =  releaseArticleMapper.selectByPrimaryKey(RaId);
        jedisClient.set(REDIS_RA_SESSION_KEY+":"+RaId, JsonUtils.objectToJson(releaseArticle));
        jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId,RA_EXPIRE);
        // 再查read是否为空, 不为空,将取到的值代入,再取like的值,代入,更新时间,返回对象
        String  tempint = jedisClient.get(REDIS_RA_SESSION_KEY+":"+RaId+":read");
        if(tempint!=null){
            releaseArticle.setRaRead(Long.valueOf(tempint));
            releaseArticle.setRaLike(Long.valueOf(jedisClient.get(REDIS_RA_SESSION_KEY+":"+RaId+":like")));
            jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId,RA_EXPIRE);
            jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId+":read",RA_RAndL_EXPIRE);
            jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId+":like",RA_RAndL_EXPIRE);
            return releaseArticle;
        }
        // 全为空,添加新值,刷新时间
        jedisClient.set(REDIS_RA_SESSION_KEY+":"+RaId+":read", String.valueOf(releaseArticle.getRaRead()));
        jedisClient.set(REDIS_RA_SESSION_KEY+":"+RaId+":like", String.valueOf(releaseArticle.getRaLike()));
        jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId+":read",RA_RAndL_EXPIRE);
        jedisClient.expire(REDIS_RA_SESSION_KEY+":"+RaId+":like",RA_RAndL_EXPIRE);
        return releaseArticle;
    }
}
