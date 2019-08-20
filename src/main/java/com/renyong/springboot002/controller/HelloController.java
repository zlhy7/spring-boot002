package com.renyong.springboot002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 任勇勇
 * @Date: 2019/08/17 11:37
 * @Description:
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String name;
    @RequestMapping("hello")
    public String hello(String id){
        return "hello world"+name;
    }
}
