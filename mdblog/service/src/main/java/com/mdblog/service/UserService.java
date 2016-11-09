package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.User;

/**
 * Created by Vincent on 16/10/13.
 */

public interface UserService {
    ResponResult addUser(User user);
    ResponResult checkData(String param, Integer type);
    ResponResult getLogin(String email, String password);
    ResponResult getUserByToken(String token);
    Long getUserIdByToken(String token);
}
