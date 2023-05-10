package com.way.controller;

import com.way.service.SpringProvider;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * openFeign服务调用端
 */
@RestController
@RequestMapping("/product")
public class ProductController {

@Resource
private SpringProvider springProvider;

    @GetMapping("/what")
    public String what(){
        return springProvider.call();
    }
}
