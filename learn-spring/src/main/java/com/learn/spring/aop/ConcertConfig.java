package com.learn.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean   //声明了一个切面bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance theatre(){
        return new Theatre();
    }
}
