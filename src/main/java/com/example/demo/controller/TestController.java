package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "hello word";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello word post, " +name;
    }
}
