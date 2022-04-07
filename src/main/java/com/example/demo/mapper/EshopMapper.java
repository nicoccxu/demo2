package com.example.demo.mapper;

import com.example.demo.domain.Eshop;
import com.example.demo.domain.EshopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EshopMapper {
    long countByExample(EshopExample example);

    int deleteByExample(EshopExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Eshop record);

    int insertSelective(Eshop record);

    List<Eshop> selectByExample(EshopExample example);

    Eshop selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Eshop record, @Param("example") EshopExample example);

    int updateByExample(@Param("record") Eshop record, @Param("example") EshopExample example);

    int updateByPrimaryKeySelective(Eshop record);

    int updateByPrimaryKey(Eshop record);
}