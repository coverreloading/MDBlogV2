package com.mdblog.manage.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.po.SysMsg;
import com.mdblog.service.ManageMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/4/8.15:55.
 */
@Controller
@RequestMapping("/msg")
public class MsgCtrl {

    @Autowired
    private ManageMsgService manageMsgService;

    @RequestMapping("")
    public String showPage(){
        return "manageMsg";
    }

    @RequestMapping("/add")
    public void add(SysMsg sysMsg, HttpServletResponse response) throws IOException {
        try {
            manageMsgService.addMsg(sysMsg);
            response.sendRedirect("/msg");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("/msg");
        }
    }

    @RequestMapping("/del")
    @ResponseBody
    public ResponResult del(long id) {
        return manageMsgService.deleteMsg(id);
    }

    @RequestMapping("/active")
    @ResponseBody
    public ResponResult active(long id) {
        return manageMsgService.activeMsg(id);
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public Map getSubject(Integer limit, Integer offset) {
        if (limit!=null && offset != null) {
            return manageMsgService.getTable(0, 5);
        }
        return null;
    }
}