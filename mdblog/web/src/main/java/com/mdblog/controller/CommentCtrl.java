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
    @ResponseBody
    public ResponResult getByRaId(Long raId, Long page, Long num) {

        List<Comments> list = commentService.getParents(raId, page, num);

        List<CommentsList> resultList = new ArrayList<CommentsList>();
        Map<String , Object> map = new HashMap<String, Object>() ;

        for (Comments c : list) {
            CommentsList commentsList = new CommentsList();
            // 获取普通楼层
            commentsList.setC(c);
            // 获取楼中楼列表
            commentsList.setCl(getByPId(c.getcId(), Long.valueOf(0), Long.valueOf(5)));
            // 获取楼中楼个数
            commentsList.setcCount(commentService.getChildrenCount(c.getcId()));
            resultList.add(commentsList);
        }
        map.put("totalnum",commentService.getParentsCount(raId));
        map.put("rl", resultList);
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
