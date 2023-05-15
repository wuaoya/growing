package com.way.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sentinel做流控，
 */
@RestController
@RequestMapping("/provider")
public class providerSentinelController {
    @GetMapping("/sentinel")
    @SentinelResource("/sentinel")
    public String sentinel01(){
        return "sentinel!!!";
    }
}
