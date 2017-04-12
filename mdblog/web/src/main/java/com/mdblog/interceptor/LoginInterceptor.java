package com.mdblog.interceptor;

/**
 * Created by loadi on 2017/3/1.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.druid.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 登录认证的拦截器
 */
public class LoginInterceptor implements HandlerInterceptor{

    /**
     * Handler执行完成之后调用这个方法
     */
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception exc)
            throws Exception {

    }

    /**
     * Handler执行之后，ModelAndView返回之前调用这个方法
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
    }

    /**
     * Handler执行之前调用这个方法
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        //获取请求的URL
        String url = request.getRequestURI();

        //获取Session
        HttpSession session = request.getSession();
        String token = (String)session.getAttribute("token");

        if(!StringUtils.isEmpty(token)){
            return true;
        }
        //不符合条件的，跳转到登录界面
        //request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        response.sendRedirect("/login");
        return false;
    }
}