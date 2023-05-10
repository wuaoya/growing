package com.way.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * nacos配置中心服务测试
 */
@RefreshScope
@RestController
@RequestMapping("/body")

public class BodyController {
    @Value("${test.infos}")
    public String infos;

    @RequestMapping("/test")
    public String test(){
        System.out.println(new Date());
        return infos;

    }
}

