package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.po.UserInfo;
import com.mdblog.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by loadi on 2017/2/12.
 */
@Controller
@RequestMapping("/uInfo")
public class UserInfoCtrl {

    @Autowired
    private UserService userService;

    @RequestMapping("/update")
    @ResponseBody
    public ResponResult updateUInfo(@RequestParam(required=true) String token , UserInfo userInfo) {
        System.out.println(token);
        System.out.println(userInfo.toString());
        long uid = userService.getUserIdByToken(token);
        if (uid == -1) {
            return ResponResult.build(400,"用户登陆过期");
        }
        userInfo.setUiUid(uid);
        // TODO: 2017/2/12 先去写service


        return null;
    }
}
