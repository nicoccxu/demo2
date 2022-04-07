package com.example.demo.service;

import com.example.demo.domain.Eshop;
import com.example.demo.domain.EshopExample;
import com.example.demo.mapper.EshopMapper;
import com.example.demo.req.EshopReq;
import com.example.demo.resp.EshopResp;
import com.example.demo.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

//        List<EshopResp> respList = new ArrayList<>();
//        for (Eshop eshop : eshopList) {
//              // EshopResp eshopResp = new EshopResp();
//              //BeanUtils.copyProperties( eshop,eshopResp );
                //对象复制
//            EshopResp eshopResp = CopyUtil.copy( eshop, EshopResp.class );
//
//            respList.add( eshopResp );
//        }
          //列表复制
        List<EshopResp> list = CopyUtil.copyList( eshopList, EshopResp.class );

        return list;
    }
}
