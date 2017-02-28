package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * 获取专题
     * @return
     */
    @RequestMapping("/getsubject")
    @ResponseBody
    public ResponResult getAllSubjects(){
        return subjectService.getSubject();
    }

    @RequestMapping("/sub/{id}")
    @ResponseBody
    public ResponResult getSubjectById(@PathVariable Integer id){
        return ResponResult.ok(subjectService.getSubjectById(id));
    }


    @RequestMapping("/getRand/{num}")
    @ResponseBody
    public ResponResult getSubjectRand(@PathVariable Integer num) {
        return subjectService.getSubjectRand(num);
    }

    @RequestMapping("/subInfo/{id}")
    @ResponseBody
    public ResponResult getSubjectInfo(@PathVariable Long id) {
        // TODO: 2017/2/23
        return null;
    }
}
