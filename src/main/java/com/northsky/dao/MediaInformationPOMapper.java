package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.MediaInformationPO;
@Mapper
public interface MediaInformationPOMapper {
    int deleteByPrimaryKey(Integer mediaId);

    int insert(MediaInformationPO record);

    int insertSelective(MediaInformationPO record);

    MediaInformationPO selectByPrimaryKey(Integer mediaId);

    int updateByPrimaryKeySelective(MediaInformationPO record);

    int updateByPrimaryKey(MediaInformationPO record);
}