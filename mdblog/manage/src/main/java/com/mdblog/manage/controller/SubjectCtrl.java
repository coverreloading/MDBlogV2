package com.mdblog.manage.controller;

import com.mdblog.po.Subject;
import com.mdblog.service.ManageSubjectService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mdblog.po.ResponResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vincent on 16/10/29.
 */
@Controller
@RequestMapping(value = "/subject")
public class SubjectCtrl {

    @Autowired
    private ManageSubjectService manageSubjectService;

    @RequestMapping(value = "/add")
    public String addSubject(Subject subject) {
        if (StringUtils.isNotBlank(subject.getsTitle()) &&
                StringUtils.isNotBlank(subject.getsDesc()) &&
                StringUtils.isNotBlank(subject.getsPic())) {

            manageSubjectService.addSubject(subject);
        }
        return "manageSubject";
    }

    @RequestMapping(value = "/update")
    public void uploadSubject(Subject subject, HttpServletResponse response) {
        if (StringUtils.isNotBlank(subject.getsTitle()) &&
                StringUtils.isNotBlank(subject.getsDesc()) &&
                StringUtils.isNotBlank(subject.getsPic())) {
            manageSubjectService.updateSubject(subject);
        }
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/setRedis")
    @ResponseBody
    public ResponResult setRedis() {
        return manageSubjectService.setSubjectRedis();
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public Map getSubject(Integer limit, Integer offset) {
        Map hashMap = new HashMap();
        if (limit != null && offset != null) {
            hashMap.put("rows", manageSubjectService.getTable(offset, limit));
            hashMap.put("total", manageSubjectService.getCount());
            return hashMap;
        }
        return null;
    }

    // 删除一个专题
    @RequestMapping("/del")
    @ResponseBody
    public ResponResult delsubject(Long sId) {
        return manageSubjectService.del(sId);
    }
}
