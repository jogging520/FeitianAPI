package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.MediaTypePO;

@Mapper
public interface MediaTypePOMapper {
    int deleteByPrimaryKey(Integer mediaTypeId);

    int insert(MediaTypePO record);

    int insertSelective(MediaTypePO record);

    MediaTypePO selectByPrimaryKey(Integer mediaTypeId);

    int updateByPrimaryKeySelective(MediaTypePO record);

    int updateByPrimaryKey(MediaTypePO record);
}