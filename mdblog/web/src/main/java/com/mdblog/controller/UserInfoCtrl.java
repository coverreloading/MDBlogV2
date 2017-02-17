package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;
import com.mdblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by loadi on 2017/2/12.
 */
@Controller
@RequestMapping("/uinfo")
public class UserInfoCtrl {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/userinfo")
    public String showUserInfo() {
        return "userInfo";
    }

    @RequestMapping(value = "/uibtok/{token}", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult getUserInfoByToken(@PathVariable("token") String token) {
        return userInfoService.getUserInfoByToken(token);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public ResponResult updateUInfo(String token, UserInfo userInfo, @RequestParam(value = "uiBirth-str") String birstr) throws ParseException {
        System.out.println("更新用户信息");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birstr);
        long ts = date.getTime();
        System.out.println(ts);
        userInfo.setUiBirth(ts);
        ResponResult result = userInfoService.updateUserInfo(token, userInfo);
        System.out.println("更新结束");
        return result;
    }
}
