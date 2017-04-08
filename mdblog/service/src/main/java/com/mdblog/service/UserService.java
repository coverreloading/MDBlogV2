package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.User;

/**
 * Created by Vincent on 16/10/13.
 */

public interface UserService {
    //通过用户id获取用户信息
    User getUserById(Long Uid);
    //注册接口
    ResponResult addUser(User user);
    //检查邮箱是否已被注册
    ResponResult checkData(String param, Integer type);
    //登陆接口
    ResponResult getLogin(String email, String password);
    //通过session或者cookies中存储的token获取用户信息
    ResponResult getUserByToken(String token);
    //通过session或者cookies中存储的token获取用户id
    Long getUserIdByToken(String token);
}
