package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SliderInformationPO;

@Mapper
public interface SliderInformationPOMapper 
{
    int deleteByPrimaryKey(Integer sliderId);

    int insert(SliderInformationPO record);

    int insertSelective(SliderInformationPO record);

    SliderInformationPO selectByPrimaryKey(Integer sliderId);
    
    List<SliderInformationPO> selectByType(String category, String type);

    int updateByPrimaryKeySelective(SliderInformationPO record);

    int updateByPrimaryKey(SliderInformationPO record);
}