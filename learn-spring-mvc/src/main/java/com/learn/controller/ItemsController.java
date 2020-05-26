package com.learn.controller;

import com.learn.model.Item;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

public class ItemsController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        Item item=new Item();
        item.setName("item");
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("item",item);
        modelAndView.setViewName("/WEB-INF/jsp/showItem.jsp");
        return modelAndView;
    }
}
