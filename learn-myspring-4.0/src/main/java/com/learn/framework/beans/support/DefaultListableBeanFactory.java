package com.learn.framework.beans.support;

import com.learn.framework.beans.config.BeanDefinition;
import com.learn.framework.context.support.AbstractApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultListableBeanFactory extends AbstractApplicationContext {

    //存储注册信息的BeanDefinition
    protected final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();
}

