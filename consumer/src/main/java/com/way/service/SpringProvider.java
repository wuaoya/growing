package com.way.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface SpringProvider {
    @GetMapping("/pro/test1")
     String call();
}
