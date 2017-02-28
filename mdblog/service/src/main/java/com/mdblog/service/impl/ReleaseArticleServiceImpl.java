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
    private ArticleTipsMapper articleTipsMapper;

    @Override
    public ResponResult addRA(String token,Long articleId,String tipJson, ReleaseArticle releaseArticle) {

        long UID= userService.getUserIdByToken(token);
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
        } catch (Exception e) {
            e.printStackTrace();
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

        return ResponResult.ok();
    }
}
