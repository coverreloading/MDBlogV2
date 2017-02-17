package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by loadi on 2017/2/17.
 */
@Controller
@RequestMapping("/follow")
public class FollowCtrl {

    @Autowired
    private FollowService followService;

    @RequestMapping("/add")
    public ResponResult addFollow(String token, Long uid) {
        return followService.addFollow(token, uid);
    }
    @RequestMapping("/remove")
    public ResponResult removeFollow( String token,Long uid) {
        return followService.removeFollow(token, uid);
    }
}
