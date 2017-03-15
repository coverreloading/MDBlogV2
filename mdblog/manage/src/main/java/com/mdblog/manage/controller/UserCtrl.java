package com.mdblog.manage.controller;

import com.mdblog.manage.dto.FullUser;
import com.mdblog.po.User;
import com.mdblog.po.UserInfo;
import com.mdblog.service.ManageUserService;
import com.mdblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/13.23:19.
 */
@Controller
@RequestMapping("/user")
public class UserCtrl {

    @Autowired
    private ManageUserService manageUserService;
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("")
    public String showPage(){
        return "manageUser";
    }

    @RequestMapping("/get")
    @ResponseBody
    public Map getSubject(Integer limit, Integer offset) {
        Map hashMap = new HashMap();
        if (limit != null && offset != null) {
            List<User> list = manageUserService.getTable(offset, limit);
            List<FullUser> resultList =new ArrayList<FullUser>();
            for (User user : list) {
                FullUser fullUser = new FullUser();
                fullUser.setUser(user);
                fullUser.setUserInfo(userInfoService.getUserInfoByUid(user.getuId()));
                resultList.add(fullUser);
            }

            hashMap.put("rows",resultList);
            hashMap.put("total", manageUserService.getCount());
            return hashMap;
        }
        return null;
    }
}
