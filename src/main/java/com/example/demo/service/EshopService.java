package com.example.demo.service;

import com.example.demo.domain.Eshop;
import com.example.demo.domain.EshopExample;
import com.example.demo.mapper.EshopMapper;
import com.example.demo.req.EshopReq;
import com.example.demo.resp.EshopResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EshopService {

    @Resource
    private EshopMapper eshopMapper;

    public List<EshopResp> list(EshopReq req){
        EshopExample eshopExample = new EshopExample();
        EshopExample.Criteria criteria = eshopExample.createCriteria();
        criteria.andNameLike( "%"+req.getName()+"%" );
        List<Eshop> eshopList = eshopMapper.selectByExample( eshopExample );

        List<EshopResp> respList = new ArrayList<>();
        for (Eshop eshop : eshopList) {
            EshopResp eshopResp = new EshopResp();
            BeanUtils.copyProperties( eshop,eshopResp );
            respList.add( eshopResp );
        }
        return respList;
    }
}
