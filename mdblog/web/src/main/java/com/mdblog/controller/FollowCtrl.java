package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by loadi on 2017/2/17.
 */
@Controller
@RequestMapping("/follow")
public class FollowCtrl {

    @Autowired
    private FollowService followService;

    // 页面跳转
    @RequestMapping("")
    public String showFollow() {
        return "follow";
    }

    /**
     * 检查是否已关注
     * @param token 用户token
     * @param uid   关注用户id
     * @return ResponResult
     */
    @RequestMapping(value = "/checkExit", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult checkExit(String token, Long uid) {
        return followService.checkFollow(token, uid);
    }

    // 添加关注
    @RequestMapping("/add")
    @ResponseBody
    public ResponResult addFollow(String token, Long uid) {
        return followService.addFollow(token, uid);
    }

    // 删除关注
    @RequestMapping("/remove")
    @ResponseBody
    public ResponResult removeFollow(String token, Long uid) {
        return followService.removeFollow(token, uid);
    }

    // 获取关注用户列表
    @RequestMapping("/getAll")
    @ResponseBody
    public ResponResult getFollowList(String token) {
        return followService.getFollowList(token);
    }
}
