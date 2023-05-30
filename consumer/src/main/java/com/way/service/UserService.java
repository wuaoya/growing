package com.way.service;

import com.way.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    Integer insertUser(User user);

    String selectUser(User user);
}
