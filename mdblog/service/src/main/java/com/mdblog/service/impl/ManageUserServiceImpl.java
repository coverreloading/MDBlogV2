package com.mdblog.service.impl;

import com.mdblog.mapper.UserMapper;
import com.mdblog.po.User;
import com.mdblog.service.ManageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/13.23:35.
 */
@Service("ManageUserService")
public class ManageUserServiceImpl implements ManageUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getTable(Integer offset, Integer limit) {
        return userMapper.selectLimit(offset, limit);
    }

    @Override
    public Integer getCount() {
        return userMapper.selectCount();
    }
}
