package com.way.service;

import com.way.entity.User;
import com.way.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public Integer insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public String selectUser(User user) {
        return null;
    }
}
