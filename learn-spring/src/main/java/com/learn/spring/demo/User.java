package com.learn.spring.demo;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello "+name);
    }

}
