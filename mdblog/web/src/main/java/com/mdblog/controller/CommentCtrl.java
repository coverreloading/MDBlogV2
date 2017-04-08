package com.mdblog.controller;

import com.mdblog.dto.CommentsList;
import com.mdblog.po.Comments;
import com.mdblog.po.ResponResult;
import com.mdblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by loading2013(win10) on 2017/3/5.12:27.in [mdblog]
 */
@Controller
@RequestMapping("/c")
public class CommentCtrl {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/add")
    @ResponseBody
    public ResponResult add(String token, Comments comments) {
        return commentService.add(token, comments);
    }

    // 分页, 通过文章id获取指定数量首层回复以及其对应的固定数量楼中楼
    @RequestMapping("/getbyraid")
    // 异步，用于将对象转为json返回到前端
    @ResponseBody
    public ResponResult getByRaId(Long raId, Long page, Long num) {
        // 获取首层回复，分页获取
        List<Comments> list = commentService.getParents(raId, page, num);
        // 创建vo对象存储回复
        List<CommentsList> resultList = new ArrayList<CommentsList>();
        // 遍历首层回复，分别查找其对应的楼中楼回复
        for (Comments c : list) {
            CommentsList commentsList = new CommentsList();
            // 获取普通楼层
            commentsList.setC(c);
            // 获取楼中楼列表,默认加载前5条
            commentsList.setCl(getByPId(c.getcId(), Long.valueOf(0), Long.valueOf(5)));
            // 获取楼中楼总数
            commentsList.setcCount(commentService.getChildrenCount(c.getcId()));
            // 存入list
            resultList.add(commentsList);
        }
        // 用于返回的map对象
        Map<String , Object> map = new HashMap<String, Object>() ;
        // 存入首层回复总数
        map.put("totalnum",commentService.getParentsCount(raId));
        // 存入对应页的评论
        map.put("rl", resultList);
        // 打包为ResponResult对象，同时返回状态码200
        return ResponResult.ok(map);
    }

    // 通过parentid 获取楼中楼
    @RequestMapping("/getbypid")
    @ResponseBody
    public List<Comments> getByPId(long pId, long page, long num) {
        return commentService.getChildren(pId, page, num);
    }


    @RequestMapping("/remove")
    @ResponseBody
    public ResponResult removeComment(String token, Long cId) {
        return commentService.removeComments(token, cId);
    }
}
