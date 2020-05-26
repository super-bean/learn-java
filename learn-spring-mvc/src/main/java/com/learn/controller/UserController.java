package com.learn.controller;

import com.learn.model.Item;
import com.learn.model.User;
import com.learn.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/userController")
public class UserController {

    private UserServiceI userService;

    public UserServiceI getUserService() {return userService;}

    @Autowired
    public void setUserService(UserServiceI userService) {
        this.userService = userService;
    }

    @RequestMapping("/showItem")
    public String showUser(@PathVariable String id, HttpServletRequest request) {
//  User u = userService.getUserById(id);
        Item item=new Item();
        item.setName("item");
        request.setAttribute("item",item);
        return "showItem";
    }

}