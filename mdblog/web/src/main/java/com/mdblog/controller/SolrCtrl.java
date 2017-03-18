package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.SolrService;
import dto.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.16:49.
 */
@Controller
@RequestMapping("/search")
public class SolrCtrl {
    @Autowired
    private SolrService solrService;

    @RequestMapping("/query")
    public String searchPage(@RequestParam String query,@RequestParam int page, @RequestParam int row) {
        return "search";
    }

    @RequestMapping("/param")
    @ResponseBody
    public SearchResult search(String query, int page, int row) throws Exception {
        query = new String(query.getBytes("iso-8859-1"), "utf-8");
        return solrService.search(query, page, row);
    }
}