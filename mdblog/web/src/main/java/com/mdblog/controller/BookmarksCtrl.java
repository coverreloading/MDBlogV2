package com.mdblog.controller;

import com.mdblog.po.ResponResult;
import com.mdblog.service.BookmarksService;
import com.mdblog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by loadi on 2017/3/1.
 */
@Controller
@RequestMapping("/bookmarks")
public class BookmarksCtrl {

    @Autowired
    private BookmarksService bookmarksService;
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("")
    public String showBookmarks(Model model, HttpSession session) {
        Long uid = Long.valueOf(session.getAttribute("uid").toString());
        model.addAttribute("uif",userInfoService.getUserInfoByUid(uid));
        return "bookmarks";
    }

    @RequestMapping("/add")
    @ResponseBody
    public ResponResult addBookmark(String token, Long aid) {
        return bookmarksService.add(token, aid);
    }

    @RequestMapping("/del")
    @ResponseBody
    public ResponResult delBookmark(String token, Long aid) {
        return bookmarksService.delete(token, aid);
    }


    @RequestMapping("/check")
    @ResponseBody
    public ResponResult checkBookmark(String token, Long aid) {
        return bookmarksService.check(token, aid);
    }

    /**
     * 获取一定数量收藏文章
     * @return
     */
    @RequestMapping("/{page}/{num}")
    @ResponseBody
    public ResponResult getBookmark( String token, @PathVariable long page, @PathVariable long num) {
        return bookmarksService.getBookmark(token, page, num);
    }
}
