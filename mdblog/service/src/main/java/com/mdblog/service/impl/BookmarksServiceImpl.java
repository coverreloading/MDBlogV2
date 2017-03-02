package com.mdblog.service.impl;

import com.mdblog.mapper.ArticleCollectionMapper;
import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.po.*;
import com.mdblog.service.BookmarksService;
import com.mdblog.service.UserService;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by loadi on 2017/3/1.
 */
@Service("BookmarksService")
public class BookmarksServiceImpl implements BookmarksService {

    @Autowired
    private ArticleCollectionMapper collectionMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private ReleaseArticleMapper ramapper;

    @Override
    public ResponResult add(String token, Long aid) {
        Long uid = userService.getUserIdByToken(token);
        if (uid == -1 || aid == null) {
            return ResponResult.build(404, "wrong");
        }
        // 查重
        ArticleCollectionExample example = new ArticleCollectionExample();
        ArticleCollectionExample.Criteria criteria = example.createCriteria();
        criteria.andAcUidEqualTo(uid);
        criteria.andAcRaIdEqualTo(aid);
        List<ArticleCollection> list = collectionMapper.selectByExample(example);
        if (list.size() > 0) {
            return ResponResult.build(400, "already have");

        } else {
            // 添加
            ArticleCollection at = new ArticleCollection();
            at.setAcUid(uid);
            at.setAcRaId(aid);
            at.setAcCreatetime(System.currentTimeMillis());
            at.setAcDel(0);
            at.setAcRaTitle(ramapper.selectByPrimaryKey(aid).getRaTitle());
            try {
                collectionMapper.insert(at);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ResponResult.ok();
        }
    }

    @Override
    public ResponResult delete(String token, Long aid) {
        Long uid = userService.getUserIdByToken(token);
        if (uid == -1 || aid == null) {
            return ResponResult.build(404, "wrong");
        }
        ArticleCollectionExample example = new ArticleCollectionExample();
        ArticleCollectionExample.Criteria criteria = example.createCriteria();
        criteria.andAcUidEqualTo(uid);
        criteria.andAcRaIdEqualTo(aid);
        List<ArticleCollection> list = collectionMapper.selectByExample(example);
        if (list.size() > 0) {
            try {
                collectionMapper.deleteByPrimaryKey(list.get(0).getAcId());
                return ResponResult.ok();
            } catch (Exception e) {
                e.printStackTrace();
                return ResponResult.build(500, "server booooom!");
            }
        } else {
            return ResponResult.build(404, "no such mark");
        }
    }

    @Override
    public ResponResult check(String token, Long aid) {
        Long uid = userService.getUserIdByToken(token);
        if (uid == -1 || aid == null) {
            return ResponResult.build(404, "wrong");
        }
        ArticleCollectionExample example = new ArticleCollectionExample();
        ArticleCollectionExample.Criteria criteria = example.createCriteria();
        criteria.andAcUidEqualTo(uid);
        criteria.andAcRaIdEqualTo(aid);
        List<ArticleCollection> list = collectionMapper.selectByExample(example);
        if (list.size() > 0) {
            return ResponResult.ok();
        } else {
            return ResponResult.build(404, "did not mark");
        }
    }

    @Override
    public ResponResult getBookmark(String token, long page, long num) {
        Long uid = userService.getUserIdByToken(token);
        if (uid == -1 || num == 0) {
            return ResponResult.build(404, "wrong");
        }
        List<Long> ids = collectionMapper.getBookmark(uid, page, num);
        List<ReleaseArticle> list = new ArrayList<ReleaseArticle>();
        for (Long id : ids) {
            list.add(ramapper.selectByPrimaryKey(id));
        }
        return ResponResult.ok(list);
    }
}