package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value( "${test.hello:TEST}" )
    private String testHello;

//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "hello word" +testHello;
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello word post, " +name;
    }
}
