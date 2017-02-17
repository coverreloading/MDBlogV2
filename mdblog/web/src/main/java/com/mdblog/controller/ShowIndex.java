package com.mdblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by loadi on 2016/9/15.
 */
@Controller
public class ShowIndex {
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String showRegister(){
        return "register";
    }
    @RequestMapping("/main")
    public String showMain(){
        return "main";
    }
    // TODO: 2016/11/8 测试用查看页面
    @RequestMapping("/page/{page}")
    public String getAnyYouWann(@PathVariable(value = "page")String page){
        return page;
    }
}