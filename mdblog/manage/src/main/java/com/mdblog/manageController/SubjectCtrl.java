package com.mdblog.manageController;

import com.mdblog.po.Subject;
import com.mdblog.service.ManageSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mdblog.po.ResponResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
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
        return "manage";
    }

    @RequestMapping(value = "/setRedis")
    @ResponseBody
    public ResponResult setRedis() {
        return manageSubjectService.setSubjectRedis();
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public List<Subject> getSubject(Integer limit, Integer offset) {
        Map hashMap = new HashMap();
        Integer page=0;
        Integer rows=0;
        Integer total = 88;
        if (limit != null && offset != null) {

            page = offset/limit+1;
            rows=limit;

            //
            //hashMap.put("total",total);
            //hashMap.put("rows", 10);
            return manageSubjectService.getTable(page,rows);
        }
        return null;
    }
}
