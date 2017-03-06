package com.mdblog.controller;

import com.mdblog.dto.CommentsList;
import com.mdblog.po.Comments;
import com.mdblog.po.ResponResult;
import com.mdblog.service.CommentService;
import com.sun.xml.internal.rngom.ast.builder.CommentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    // 分页
    @RequestMapping("/get")
    @ResponseBody
    public ResponResult add(Long raId,Long page,Long num) {

        List<Comments> list = commentService.getParents(raId, page, num);

        List<CommentsList> resultList = new ArrayList<CommentsList>();

        for (Comments c : list) {
            CommentsList commentsList = new CommentsList();
            commentsList.setC(c);
            resultList.add(commentsList);
        }
        return ResponResult.ok(resultList);
    }
}
