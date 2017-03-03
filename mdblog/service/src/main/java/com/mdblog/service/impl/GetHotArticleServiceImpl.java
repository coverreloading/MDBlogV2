package com.mdblog.service.impl;

import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.po.JedisClient;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.service.GetHotArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by loadi on 2017/2/19.
 */
@Service("GetHotArticleService")
public class GetHotArticleServiceImpl implements GetHotArticleService {

    @Autowired
    private ReleaseArticleMapper releaseArticleMapper;
    @Autowired
    private JedisClient jedisClient;
    @Value("${REDIS_RA_SESSION_KEY}")
    String REDIS_RA_SESSION_KEY;

    @Override
    public List<ReleaseArticle> getByNum(int page, int num) {

        // 方法一 无视read like
        //List<ReleaseArticle> list = releaseArticleMapper.selectHot(page, num);
        //return list;

        // 方法二 获取read 和like
        List<ReleaseArticle> list = releaseArticleMapper.selectHot(page, num);
        return privateMethod(list);
    }

    @Override
    public List<ReleaseArticle> getHotByUid(Long uid, Long page, Long num) {
        List<ReleaseArticle> list = releaseArticleMapper.selectHotByUid(uid, page, num);
        return privateMethod(list);
    }

    @Override
    public List<ReleaseArticle> getSubjectlist(Long subid, long page, long num) {
        List<ReleaseArticle> list = releaseArticleMapper.selectListBySubid(subid, page, num);
        return privateMethod(list);
    }

    /**内部方法 用于从redis中更新read和like
     * @param list
     * @return
     */
    private List<ReleaseArticle> privateMethod(List<ReleaseArticle> list) {
        List<ReleaseArticle> newList = new ArrayList<>();
        for (ReleaseArticle ra : list) {
            String baseKey = REDIS_RA_SESSION_KEY + ":" + ra.getRaId();
            String readKey = baseKey + ":read";
            String likeKey = baseKey + ":like";
            if (org.apache.commons.lang3.StringUtils.isBlank(jedisClient.get(readKey))) {
                newList.add(ra);
                continue;
            }
            ra.setRaRead(Long.valueOf(jedisClient.get(readKey)));
            ra.setRaLike(Long.valueOf(jedisClient.get(likeKey)));
            newList.add(ra);
        }
        return newList;
    }
}