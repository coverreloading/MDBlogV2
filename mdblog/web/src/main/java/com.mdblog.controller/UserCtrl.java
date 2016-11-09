package com.mdblog.controller;



import com.mdblog.po.ResponResult;
import com.mdblog.po.User;
import com.mdblog.service.UserService;
import com.mdblog.common.utils.ExceptionUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Vincent on 16/10/13.
 */
@Controller
@Scope("prototype")
@RequestMapping("user")
public class UserCtrl {

    @Autowired
    private UserService userService;

    /**
     * @param param    names,email
     * @param type     1,2对应names,email
     * @param callback
     * @return
     */
    @RequestMapping("/check/{param}/{type}")
    @ResponseBody
    public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {

        ResponResult result = null;

        //参数有效性校验
        if (StringUtils.isBlank(param)) {
            result = ResponResult.build(400, "校验内容不能为空");
        }
        if (type == null) {
            result = ResponResult.build(400, "校验内容类型不能为空");
        }
        if (type != 1 && type != 2) {
            result = ResponResult.build(400, "校验内容类型错误,不要搞事我跟你讲");
        }
        //校验出错
        if (null != result) {
            if (null != callback) {
                MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
                mappingJacksonValue.setJsonpFunction(callback);
                return mappingJacksonValue;
            } else {
                return result;
            }
        }
        //调用服务
        try {
            result = userService.checkData(param, type);

        } catch (Exception e) {
            result = ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }

        if (null != callback) {
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        } else {
            return result;
        }
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult regist(User user) {
        ResponResult responResult = null;
        try {
            if (StringUtils.isNotEmpty(user.getuEmail()) && StringUtils.isNotEmpty(user.getuPassword())) {
                responResult = userService.addUser(user);
                return responResult;
            } else {
                return ResponResult.build(400, "你想搞事?");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public ResponResult login(String email, String password, HttpServletRequest request, HttpServletResponse response) {
        try {
            if (StringUtils.isNotEmpty(email) && StringUtils.isNotEmpty(password)) {
                ResponResult responResunlt = userService.getLogin(email, password);
                System.out.println(responResunlt.getData());
                request.getSession().setAttribute("token", responResunlt.getData());
                request.getSession().setMaxInactiveInterval(3600);
                return responResunlt;
            } else {
                return ResponResult.build(400, "你想搞事?");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

    @RequestMapping(value = "token/{token}")
    @ResponseBody
    public ResponResult getUserByToken(@PathVariable String token) {
        try {
            if (StringUtils.isNotEmpty(token)) {
                ResponResult responResult = userService.getUserByToken(token);
                return responResult;
            } else {
                return ResponResult.build(400, "你想搞事?");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }
}
