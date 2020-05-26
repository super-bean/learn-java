package com.learn.controller;

import com.learn.model.Item;
import com.learn.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/item")
public class UserController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/query")
    public String showItem(HttpServletRequest request) {
        Item item = itemService.selectByName("3");
        request.setAttribute("item",item);
        return "showItem";
    }

}