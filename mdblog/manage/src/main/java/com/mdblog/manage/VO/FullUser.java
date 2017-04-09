package com.mdblog.manage.VO;

import com.mdblog.po.User;
import com.mdblog.po.UserInfo;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/14.15:59.
 */
public class FullUser {
    private User user;
    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "FullUser{" +
                "user=" + user +
                ", userInfo=" + userInfo +
                '}';
    }
}
