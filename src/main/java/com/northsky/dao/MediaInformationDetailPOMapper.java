package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.MediaInformationDetailPO;
@Mapper
public interface MediaInformationDetailPOMapper {
    int deleteByPrimaryKey(Integer mediaDetailId);

    int insert(MediaInformationDetailPO record);

    int insertSelective(MediaInformationDetailPO record);

    MediaInformationDetailPO selectByPrimaryKey(Integer mediaDetailId);

    int updateByPrimaryKeySelective(MediaInformationDetailPO record);

    int updateByPrimaryKey(MediaInformationDetailPO record);
}