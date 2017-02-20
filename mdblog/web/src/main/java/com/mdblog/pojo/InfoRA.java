package com.mdblog.pojo;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.UserInfo;

/**
 * Created by loadi on 2017/2/20.
 */
public class InfoRA {
    private UserInfo ui;
    private ReleaseArticle ra;

    public UserInfo getUi() {
        return ui;
    }

    public void setUi(UserInfo ui) {
        this.ui = ui;
    }

    public ReleaseArticle getRa() {
        return ra;
    }

    public void setRa(ReleaseArticle ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "InfoRA{" +
                "ui=" + ui +
                ", ra=" + ra +
                '}';
    }
}
