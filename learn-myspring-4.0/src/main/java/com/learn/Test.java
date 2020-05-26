package com.learn;

import com.learn.demo.action.DemoAction;
import com.learn.framework.context.ApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ApplicationContext("classpath:application.properties");
        try {
            Object object = context.getBean("demoAction");
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
