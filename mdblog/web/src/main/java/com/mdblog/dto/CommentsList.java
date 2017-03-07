package com.mdblog.dto;

import com.mdblog.po.Comments;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/6.11:00.
 */
public class CommentsList {
    private Comments c;
    private int cCount;
    private List<Comments> cl;

    public int getcCount() {
        return cCount;
    }

    public void setcCount(int cCount) {
        this.cCount = cCount;
    }

    public Comments getC() {
        return c;
    }

    public void setC(Comments c) {
        this.c = c;
    }

    public List<Comments> getCl() {
        return cl;
    }

    public void setCl(List<Comments> cl) {
        this.cl = cl;
    }
}
