package com.mdblog.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vincent on 16/10/28.
 */
@Controller
public class ShowPageCtrl {
    @RequestMapping(value = "/page/{page}")
    public String ShowManage(@PathVariable(value = "page")String page){
        return page;
    }
}