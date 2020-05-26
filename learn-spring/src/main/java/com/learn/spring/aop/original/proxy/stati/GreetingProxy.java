package com.learn.spring.aop.original.proxy.stati;

import com.learn.spring.aop.original.Greeting;
import com.learn.spring.aop.original.GreetingImpl;

public class GreetingProxy implements Greeting {

    private GreetingImpl greetingImpl;

    public GreetingProxy(GreetingImpl greetingImpl) {
        this.greetingImpl = greetingImpl;
    }

    @Override
    public void sayHello(String name) {
        before();
        greetingImpl.sayHello(name);
        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}