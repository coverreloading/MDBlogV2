package com.mdblog.controller;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ResponResult;
import com.mdblog.dto.InfoRA;
import com.mdblog.service.GetHotArticleService;
import com.mdblog.service.ShowArticleService;
import com.mdblog.service.SubjectService;
import com.mdblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private GetHotArticleService getHotArticleService;
    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/articleArea")
    public String showArticleArea() {
        return "model/articleAreaold";
    }


    /**
     * 异步获取用户 文章 评论信息 评论未完成添加
     * @param RaId
     * @return
     */
    @RequestMapping(value = "/{RaId}")
    public String getAll(Model model, @PathVariable(value = "RaId") Long RaId) {
        try {
            // 根据id获取文章
            ResponResult responResult = showArticleService.getRaByRaId(RaId);
            if (responResult.getStatus() == 404) {
                // 状态码为404，返回404页面
                return "404";
            }
            // 取到文章
            ReleaseArticle releaseArticle = (ReleaseArticle)responResult.getData();
            // 往model添加文章信息和作者信息
            model.addAttribute("ra", releaseArticle);
            model.addAttribute("uif", userInfoService.getUserInfoByUid(releaseArticle.getRaUid()));
            // 返回文章页
            return "article";
        } catch (Exception e) {
            e.printStackTrace();
            return "404";
        }
    }

    @RequestMapping("/hot/{page}/{num}")
    @ResponseBody
    public ResponResult getHotArticle(@PathVariable int page, @PathVariable int num) {
        Long startTime = System.currentTimeMillis();
        List<InfoRA> list = new ArrayList<InfoRA>();
        for (ReleaseArticle ra : getHotArticleService.getByNum(page, num)) {
            InfoRA infoRA = new InfoRA();
            infoRA.setRa(ra);
            infoRA.setUi(userInfoService.getUserInfoByUid(ra.getRaUid()));
            infoRA.setSub(subjectService.getSubjectById(ra.getRaSubjectId()));
            list.add(infoRA);
        }
        Long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("耗时"+ totalTime +"ms");
        return ResponResult.ok(list);
    }

    // 获取指定用户热门文章
    @RequestMapping(value = "/hot/{uid}/{page}/{num}")
    @ResponseBody
    public ResponResult getHotArticleByUid(@PathVariable long uid, @PathVariable long page, @PathVariable long num) {
        return ResponResult.ok(getHotArticleService.getHotByUid(uid,page,num));
    }

    /**
     * 获取专题指定数量文章
     * @param subid
     * @param page
     * @param num
     * @return
     */
    @RequestMapping(value = "/{subid}/{page}/{num}")
    @ResponseBody
    public ResponResult getHotArticlelist(@PathVariable long subid, @PathVariable long page, @PathVariable long num) {
        Long startTime = System.currentTimeMillis();
        List<InfoRA> list = new ArrayList<InfoRA>();
        for (ReleaseArticle ra : getHotArticleService.getSubjectlist(subid,page,num)) {
            InfoRA infoRA = new InfoRA();
            infoRA.setRa(ra);
            infoRA.setUi(userInfoService.getUserInfoByUid(ra.getRaUid()));
            list.add(infoRA);
        }
        Long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("耗时"+ totalTime +"ms");
        return ResponResult.ok(list);
    }
}
