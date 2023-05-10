package com.way.controller;

import com.way.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pro")
@Tag(name = "openFeign")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test1")
    @Operation(summary = "测试接口1", description = "test1")
    public String test1(){
        return productService.test1();
    }

    @GetMapping("/test2")
    @Operation(summary = "测试接口2", description = "test2")
    public String test2(){
        return productService.test2();
    }
}
