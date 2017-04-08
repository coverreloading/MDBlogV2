package com.mdblog.service.impl;

import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.po.JedisClient;
import com.mdblog.po.ResponResult;
import com.mdblog.service.ManageReadLikeCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ExceptionTypeFilter;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by loadi on 2017/2/17.
 */
@Service("ManageReadLikeCount")
public class ManageReadLikeCountImpl implements ManageReadLikeCount {

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

    /**
     * 定时任务
     * 目前效率低下
     * redis中取出read like 数值存数据库,并清除对应key
     *
     * @return
     */
    @Override
    public ResponResult updateCount() {
        Long startTime = System.currentTimeMillis();
        Long updateCount = Long.valueOf(0);
        List<Long> ids = releaseArticleMapper.selectIdList();
        System.out.println("开始缓存："+new Date());
        for (Long id:ids) {
            // 对应id的点赞数key
            String lKeys = REDIS_RA_SESSION_KEY + ":" + id + ":like";
            // 是否存在该键值对
            if (!jedisClient.exits(lKeys)) {
                System.out.println(id + "不存在redis中");
                continue;
            }
            // 存在，即定义阅读数的key
            String rKeys = REDIS_RA_SESSION_KEY + ":" + id + ":read";
            String baseKeys = REDIS_RA_SESSION_KEY + ":" + id;
            System.out.println(id + "存在");
            // 通过key到redis中取对应value
            Long readCount = Long.valueOf(jedisClient.get(rKeys));
            Long likeCount = Long.valueOf(jedisClient.get(lKeys));
            try {
                // 更新，插入数据库
                releaseArticleMapper.updateReadLikeByPrimaryKey(id, readCount, likeCount);
                // 删除redis值
                jedisClient.del(rKeys);
                jedisClient.del(lKeys);
                jedisClient.del(baseKeys);
                updateCount++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime - startTime;
        String msg = "本次包含" + ids.size() + "条数据,数据库更新" + updateCount + "次,耗时" + totalTime + "ms";
        System.out.println("缓存结束："+new Date());
        return ResponResult.ok(msg);
    }

    public ResponResult updateCountStf(){
        Long startTime = System.currentTimeMillis();
        Long updateCount = Long.valueOf(0);
        List<Long> ids = releaseArticleMapper.selectIdList();
        System.out.println("开始缓存："+new Date());
        for (Long id:ids) {
            // 对应id的key
            String lKeys = REDIS_RA_SESSION_KEY + ":" + id + ":like";
            // 是否存在该键值对
            if (!jedisClient.exits(lKeys)) {
                System.out.println(id + "不存在redis中");
                continue;
            }
            // 存在，即定义阅读数的key

            String rKeys = REDIS_RA_SESSION_KEY + ":" + id + ":read";
            String baseKeys = REDIS_RA_SESSION_KEY + ":" + id;

            System.out.println(id + "存在");
            Long readCount = Long.valueOf(jedisClient.get(rKeys));
            Long likeCount = Long.valueOf(jedisClient.get(lKeys));
            try {
                releaseArticleMapper.updateReadLikeByPrimaryKey(id, readCount, likeCount);
                jedisClient.del(rKeys);
                jedisClient.del(lKeys);
                jedisClient.del(baseKeys);
                updateCount++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        Long endTime = System.currentTimeMillis();
        Long totalTime = endTime - startTime;
        String msg = "本次包含" + ids.size() + "条数据,数据库更新" + updateCount + "次,耗时" + totalTime + "ms";
        System.out.println("缓存结束："+new Date());
        return ResponResult.ok(msg);
    }
}
