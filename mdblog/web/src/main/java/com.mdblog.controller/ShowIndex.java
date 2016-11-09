package com.mdblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by loadi on 2016/9/15.
 */
@Controller
public class ShowIndex {
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping({"/index","/"})
    public String showIndex(){
        return "login";
    }
    @RequestMapping("/main")
    public String showMain(){
        return "main";
    }
    @RequestMapping("/register")
    public String showRegister(){
        return "register";
    }
    @RequestMapping("/test}")
    public String showtest(){
        return "test";
    }
    // TODO: 2016/11/8 测试用查看页面
    @RequestMapping("/page/{page}")
    public String getAnyYouWann(@PathVariable(value = "page")String page){
        return page;
    }
}