package com.learn.framework.webmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerAdapter {
    public boolean supports(Object handler){ return (handler instanceof HandlerMapping);}


    ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        return null;
    }
}
