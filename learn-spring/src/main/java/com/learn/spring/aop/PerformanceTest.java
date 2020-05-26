package com.learn.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PerformanceTest {
    public static void main(String[] args) {
        //加载java配置类获取Spring应用上下文
        ApplicationContext ac=new AnnotationConfigApplicationContext(ConcertConfig.class);
        //获取播放器
        Performance pf=ac.getBean(Performance.class);
        //播放
        pf.perform();
    }
}
