package org.hzg.springboot.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hzgal on 2019-10-27.
 */
public class LogIntercepter implements HandlerInterceptor {

    //请求之前的处理
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===================preHandle==========================" + handler.getClass());
        return true;
    }

    //请求之后页面渲染之前的处理
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("=====================postHandle========================");
    }

    //请求完全完成之后的处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=====================afterCompletion========================");
    }
}
