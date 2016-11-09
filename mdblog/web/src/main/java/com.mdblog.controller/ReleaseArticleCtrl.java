package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.service.ReleaseArticleService;
import com.mdblog.common.utils.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Vincent on 16/10/27.
 */
@Controller
@RequestMapping(value = "/RA")
public class ReleaseArticleCtrl {

    @Autowired
    private ReleaseArticleService releaseArticleService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult releaseNew(String token,Long articleId,String tipJson,String raSubjectJson, ReleaseArticle releaseArticle) {
        try {
            raSubjectJson=raSubjectJson.trim();
            String[] str = raSubjectJson.split("\\.");
            releaseArticle.setRaSubjectId(Long.valueOf(str[0]));

            releaseArticleService.addRA(token,articleId,tipJson,releaseArticle);
            return ResponResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500,ExceptionUtil.getStackTrace(e));
        }
    }
}
