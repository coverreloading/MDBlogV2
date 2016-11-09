package com.mdblog.controller;

import com.mdblog.po.Article;
import com.mdblog.po.ResponResult;
import com.mdblog.service.ArticleService;
import com.mdblog.common.utils.ExceptionUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vincent on 16/10/17.
 */
@Controller
@RequestMapping("/article")
public class ArticleCtrl {

    @Autowired
    private ArticleService articleService;


    @RequestMapping(value = "/defaultShow")
    @ResponseBody
    public ResponResult defaultShow(){
        return ResponResult.build(200,"# 能看就行");
    }

    @RequestMapping(value = "/addArticle" ,method = RequestMethod.POST)
    @ResponseBody
    public ResponResult addArticle(String token) {
        try {
            if (StringUtils.isNotEmpty(token)){
                ResponResult responResult = articleService.addArticle(token);
                return responResult;
            }
            else {
                return ResponResult.build(400,"session过期,重新登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

    @RequestMapping(value = "/updateArticle",method = RequestMethod.POST)
    @ResponseBody
    public ResponResult updateArticle(String token,Article article) {
        try {
            if (StringUtils.isNotEmpty(token)&&article.getaId()!=null&&article.getaUid()!=null){
                ResponResult responResult = articleService.updateArticle(token,article);
                return responResult;
            }
            else {
                return ResponResult.build(400,"session过期,重新登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }

    }

    @RequestMapping(value = "/getArticle",method = RequestMethod.POST)
    @ResponseBody
    public ResponResult getArticle(String token, Long articleId) {
        try {
            if (StringUtils.isNotEmpty(token)&&articleId!=null){
                ResponResult responResult = articleService.getArticle(token,articleId);
                return responResult;
            }
            else {
                return ResponResult.build(400,"session过期,重新登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

    // check用于判断是从redis中获取数据
    @RequestMapping(value = "/getAllArticle",method = RequestMethod.POST)
    @ResponseBody

    public ResponResult getAllArticle(String token, @RequestParam(value = "check")int getFromRedis) {
        try {
            if (StringUtils.isNotEmpty(token)){
                ResponResult responResult = articleService.getAllArticle(token,getFromRedis);
                return responResult;
            }
            else {
                return ResponResult.build(400,"session过期,重新登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }
    @RequestMapping(value = "/delArticle",method = RequestMethod.POST)
    @ResponseBody
    public ResponResult deleteArticle(String token,Long articleId) {
        try {
            if (StringUtils.isNotEmpty(token)&&articleId!=null){
                ResponResult responResult = articleService.deleteArticle(token,articleId);
                return responResult;
            }
            else {
                return ResponResult.build(400,"session过期,重新登录");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }
}
