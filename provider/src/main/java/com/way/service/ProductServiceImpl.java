package com.way.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public String test1() {
        return LocalTime.now().toString() + "test1";
    }

    @Override
    public String test2() {
        return LocalTime.now().toString() + "test2";
    }
}
