package com.mdblog.service;

import com.mdblog.po.User;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/13.23:34.
 */
public interface ManageUserService {

    List<User> getTable(Integer offset, Integer limit);

    Integer getCount();
}
