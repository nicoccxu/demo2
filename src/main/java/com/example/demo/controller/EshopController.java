package com.example.demo.controller;

import com.example.demo.domain.Eshop;
import com.example.demo.service.EshopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/eshop")
public class EshopController {

    @Resource
    private EshopService eshopService;

    @GetMapping("/list")
    public List<Eshop> list(){
    return eshopService.list();
    }
}