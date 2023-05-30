package com.way.service;

import com.way.mapper.UserMapper;
import com.way.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public Integer insertUser(User user) {
        return userMapper.insert(user);
    }
}
