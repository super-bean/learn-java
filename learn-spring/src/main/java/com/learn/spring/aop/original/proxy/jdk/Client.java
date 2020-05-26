package com.learn.spring.aop.original.proxy.jdk;

import com.learn.spring.aop.original.Greeting;
import com.learn.spring.aop.original.GreetingImpl;

public class Client {

    public static void main(String[] args) {
        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        greeting.sayHello("Jack");
    }
}