package com.mdblog.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vincent on 16/10/28.
 */
@Controller
public class ShowIndexCtrl {
    @RequestMapping({"/index","/"})
    public String ShowManage(){
        return "manageSubject";
    }
}
