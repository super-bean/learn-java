package com.learn.service.impl;

import com.learn.dao.UserMapper;
import com.learn.model.User;
import com.learn.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> getAll2() {
        return userMapper.getAll2();
    }

    @Override
    public List<User> getAll3() {
        return userMapper.getAll3();
    }

}
