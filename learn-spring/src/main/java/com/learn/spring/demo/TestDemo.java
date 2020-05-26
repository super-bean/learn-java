package com.learn.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        User user=new User();
        user.setName("LiChao");
        user.sayHello();

        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        User springUser=(User) context.getBean("user");
        springUser.sayHello();
    }
}
