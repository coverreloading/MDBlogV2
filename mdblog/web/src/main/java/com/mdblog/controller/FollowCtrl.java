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

    @RequestMapping(value = "/checkExit", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult checkExit(String token, Long uid) {

        return followService.checkFollow(token, uid);
    }

    @RequestMapping("/add")
    @ResponseBody
    public ResponResult addFollow(String token, Long uid) {

        return followService.addFollow(token, uid);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public ResponResult removeFollow(String token, Long uid) {

        return followService.removeFollow(token, uid);
    }
}
