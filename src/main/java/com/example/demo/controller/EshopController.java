package com.example.demo.controller;

import com.example.demo.req.EshopReq;
import com.example.demo.resp.CommonResp;
import com.example.demo.resp.EshopResp;
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
    public CommonResp list(EshopReq req){
        CommonResp<List<EshopResp>> resp = new CommonResp<>();
        List<EshopResp>list = eshopService.list(req);
        resp.setContent( list );
        return resp;
    }
}