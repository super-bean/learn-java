package com.learn.spring.aop.original.proxy.cglib;

import com.learn.spring.aop.original.Greeting;
import com.learn.spring.aop.original.GreetingImpl;

public class Client {

    public static void main(String[] args) {
        Greeting greeting = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        greeting.sayHello("Jack");
    }
}