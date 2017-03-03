package com.mdblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by loadi on 2017/3/3.
 */
@Controller
public class ErrorCtrl {

    /** 自定义404页面
     * @return
     */
    @RequestMapping("*")
    public String errorPage() {
        return "404";
    }
}
