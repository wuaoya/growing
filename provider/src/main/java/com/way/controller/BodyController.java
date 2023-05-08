package com.way.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/body")

public class BodyController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
