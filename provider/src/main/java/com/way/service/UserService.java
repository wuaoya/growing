package com.way.service;


import com.way.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    Integer insertUser(User user);
}
