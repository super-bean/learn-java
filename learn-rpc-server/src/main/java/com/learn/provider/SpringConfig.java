package com.learn.provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.learn.api")
public class SpringConfig {

    @Bean(name="rpcServer")
    public RpcServer RpcServer(){
        return new RpcServer(8080);
    }
}
