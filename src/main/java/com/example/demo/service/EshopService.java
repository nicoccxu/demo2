package com.example.demo.service;

import com.example.demo.domain.Eshop;
import com.example.demo.mapper.EshopMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EshopService {

    @Resource
    private EshopMapper eshopMapper;

    public List<Eshop> list(){
        return eshopMapper.selectByExample( null );
    }
}
