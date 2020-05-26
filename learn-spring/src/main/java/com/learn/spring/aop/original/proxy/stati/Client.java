package com.learn.spring.aop.original.proxy.stati;

import com.learn.spring.aop.original.Greeting;
import com.learn.spring.aop.original.GreetingImpl;

public class Client {

    public static void main(String[] args) {
        Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
        greetingProxy.sayHello("Jack");
    }
}