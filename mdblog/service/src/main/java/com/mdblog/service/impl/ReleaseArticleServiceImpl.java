package com.mdblog.service.impl;

import com.mdblog.mapper.ArticleMapper;
import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.mapper.UserMapper;
import com.mdblog.po.Article;
import com.mdblog.po.JedisClient;
import com.mdblog.po.ResponResult;
import com.mdblog.po.ReleaseArticle;
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

        releaseArticleMapper.insert(releaseArticle);

        return ResponResult.ok();
    }
}
