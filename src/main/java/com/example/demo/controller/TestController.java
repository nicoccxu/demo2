package com.example.demo.controller;

import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Value( "${test.hello:TEST}" )
    private String testHello;

    @Resource
    private TestService testService;

//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "hello word" +testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello word post, " +name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){

    return testService.list();
    }
}