package com.learn.spring.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution( ** Performance.perform(..))")  //定义命令的切点
    public void performance(){}

    @Before("performance()")    //在表演之前
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")    //在表演之前
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")    //表演之后
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){    //表演失败之后
        System.out.println("Demanding a refund");
    }
}
