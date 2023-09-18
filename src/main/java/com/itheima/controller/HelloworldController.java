package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldc
 * @create 2023-09-18 9:48
 */
@RestController

public class HelloworldController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        return "ok ok";
    }
}
