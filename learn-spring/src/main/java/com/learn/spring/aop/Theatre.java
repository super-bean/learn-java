package com.learn.spring.aop;

public class Theatre implements Performance {
    @Override
    public void perform() {
        System.out.println("50个人正在表演舞台剧");
    }
}
