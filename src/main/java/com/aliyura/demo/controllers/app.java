package com.aliyura.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class app {

    @GetMapping("/test")
    public  String test(){
        return  "Hello";
    }
}
