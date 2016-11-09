package com.mdblog.controller;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;
import com.mdblog.service.ShowArticleService;
import com.mdblog.service.UserInfoService;
import org.apache.ibatis.reflection.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Vincent on 16/10/31.
 */
@Controller
@RequestMapping(value = "/a")
public class ShowArticleCtrl {

    @Autowired
    private ShowArticleService showArticleService;
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/articleArea")
    public String showArticleArea() {
        return "articleArea";
    }

    @RequestMapping(value = "/{RaId}")
    public String showArticlePage(HttpServletRequest request, @PathVariable(value = "RaId") Long RaId) {
        //request.setAttribute("RaId",RaId);
        //request.setAttribute("basepath",request.getRequestURL());
        // 获取文章
        ReleaseArticle releaseArticle = showArticleService.getRaByRaId(RaId);
        // 获取用户信息
        request.setAttribute("RA", releaseArticle);
        return "article";
    }

    // TODO: 2016/11/8 前端未完成,为测试
    // 先查询文章, 后延迟加载作者信息
    @RequestMapping(value = "/{RaId}/ui", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult getRaUi(long Uid) {
        try {
            UserInfo userInfo = userInfoService.getUserInfo(Uid);
            return ResponResult.ok(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(400, "wrong Id,no such article!");
        }
    }

    // 查询作者信息后 查询评论
    @RequestMapping(value = "{/RaId}/comments", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult getComments(@PathVariable(value = "RaId") long RaId) {
        // TODO: 2016/11/8  未完成
        return null;
    }

    //@RequestMapping(value = "/get/{RaId}")
    //@ResponseBody
    //public ReleaseArticle showArticle(@PathVariable(value = "RaId")Long RaId){
    //    try {
    //
    //        return responResult;
    //    } catch (Exception e) {
    //        e.printStackTrace();
    //        return ResponResult.build(500, com.mdblog.utils.ExceptionUtil.getStackTrace(e));
    //    }
    //}
}
