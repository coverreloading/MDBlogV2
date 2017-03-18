package com.mdblog.manage.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.14:34.
 */
@Controller
@RequestMapping("/search")
public class SolrCtrl {
    @Autowired
    private SolrService solrService;

    @RequestMapping("/import/{days}")
    @ResponseBody
    private ResponResult addDocByDays(@PathVariable Integer days) {
        return solrService.solrInsert(days);
    }
}
