package com.mdblog.service.impl;

import com.mdblog.mapper.ReleaseArticleMapper;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.service.GetHotArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by loadi on 2017/2/19.
 */
@Service("GetHotArticleService")
public class GetHotArticleServiceImpl implements GetHotArticleService {

    @Autowired
    private ReleaseArticleMapper releaseArticleMapper;

    @Override
    public List<ReleaseArticle> getByNum(int page, int num) {
        List<ReleaseArticle> list = releaseArticleMapper.selectHot(page, num);
        // TODO: 2017/2/19  
        return list;
    }
}