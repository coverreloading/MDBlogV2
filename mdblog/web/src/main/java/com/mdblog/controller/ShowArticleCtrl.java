package com.mdblog.controller;

import com.mdblog.common.utils.JsonUtils;
import com.mdblog.mapper.UserMapper;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.po.User;
import com.mdblog.po.UserInfo;
import com.mdblog.pojo.UserArticleComment;
import com.mdblog.service.ShowArticleService;
import com.mdblog.service.UserInfoService;
import com.mdblog.service.UserService;
import com.sun.tools.javac.comp.Todo;
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

    /**
     * 返回页面
     *
     * @param RaId
     * @return
     */
    @RequestMapping(value = "/{RaId}")
    public String showArticlePage(@PathVariable(value = "RaId") Long RaId) {
        return "article";
    }

    /**
     * @param request
     * @param RaId
     * @return 获取文本信息
     */
    // 2017/2/4
    @RequestMapping(value = "/{RaId}/json")
    @ResponseBody
    public ResponResult getArticle(HttpServletRequest request, @PathVariable(value = "RaId") Long RaId) {
        try {
            return showArticleService.getRaByRaId(RaId);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, com.mdblog.common.utils.ExceptionUtil.getStackTrace(e));
        }
    }

    /**
     * 返回单独文本内容
     *
     * @param RaId
     * @return
     */
    // TODO: 2017/2/4
    @RequestMapping(value = "/RaContent/{RaId}")
    @ResponseBody
    public ResponResult getRaContentById(@PathVariable(value = "RaId") long RaId) {
        try {
            String raText = showArticleService.getRaContentByRaId(RaId);
            return ResponResult.ok(raText);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(400, "wrong Id,no such article!");
        }
    }

    /**
     * getUserInformation先查询文章, 后延迟加载作者信息
     *
     * @param Uid
     * @return
     */
    // TODO: 2016/11/8 前端未完成,为测试
    @RequestMapping(value = "/User/{Uid}", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult getRaUi(@PathVariable(value = "Uid") long Uid) {
        try {
            UserInfo userInfo = userInfoService.getUserInfoByUid(Uid);
            return ResponResult.ok(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(400, "wrong Id,no such article!");
        }
    }

    /**
     * 评论 查询作者信息后 查询评论
     *
     * @param RaId
     * @return
     */
    @RequestMapping(value = "{/RaId}/comments", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult getComments(@PathVariable(value = "RaId") long RaId) {
        // TODO: 2016/11/8  未完成
        return null;
    }


    // TODO: 2017/2/10  一步到位,此方法通过,上面方法除showArticleArea均可删除

    /**
     * 异步获取用户 文章 评论信息 评论未完成添加
     *
     * @param request
     * @param RaId
     * @return
     */
    @RequestMapping(value = "/{RaId}/getall")
    @ResponseBody
    public ResponResult getAll(HttpServletRequest request, @PathVariable(value = "RaId") Long RaId) {
        try {
            UserArticleComment userArticleComment = new UserArticleComment();

            ResponResult responResult = showArticleService.getRaByRaId(RaId);
            if (responResult.getStatus() == 404) {
                return responResult;
            }
            ReleaseArticle releaseArticle = JsonUtils.jsonToPojo(String.valueOf(responResult.getData()), ReleaseArticle.class);

            userArticleComment.setReleaseArticle(releaseArticle);
            // TODO: 2017/2/11 尚无用户信息
            //UserInfo userInfo = userInfoService.getUserInfoByUid(releaseArticle.getRaUid());
            //userArticleComment.setUserInfo(userInfo);
            // TODO: 2017/2/10 Comment 未赋值
            return ResponResult.ok(userArticleComment);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(400, "wrong Id,no such article!");
        }
    }
}
