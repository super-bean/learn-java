package com.learn.demo.service.impl;

import com.learn.demo.service.IDemoService;
import com.learn.framework.annotation.Service;

/**
 * 核心业务逻辑
 */
@Service
public class DemoServiceImpl implements IDemoService {

    public String get(String name) {
        return "My name is " + name;
    }

}

