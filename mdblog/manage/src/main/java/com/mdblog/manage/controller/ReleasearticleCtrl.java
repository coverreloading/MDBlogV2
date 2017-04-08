package com.mdblog.manage.controller;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.service.GetHotArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/20.9:10.
 */
@Controller
@RequestMapping("/ra")
public class ReleasearticleCtrl {

    @Autowired
    private GetHotArticleService service;

    // TODO: 2017/3/20 未测试 
    @RequestMapping("/show")
    @ResponseBody
    public ResponResult show(int offset, int rows) {
        List<ReleaseArticle> list = service.selectAllLimit(offset, rows);
        return ResponResult.ok(list);
    }
}
