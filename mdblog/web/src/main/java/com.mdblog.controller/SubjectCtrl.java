package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vincent on 16/10/30.
 */
@Controller
@RequestMapping(value = "/subject")
public class SubjectCtrl {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/getsubject")
    @ResponseBody
    public ResponResult getSubject(){
        return subjectService.getSubject();
    }
}
