package com.way.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * openFeign定义调用的服务名
 */
@FeignClient("provider")
public interface SpringProvider {
    /**
     * 此处的注解定义了调用provider服务的哪一个path
     * @return
     */
    @GetMapping("/pro/test1")
     String call();
}
