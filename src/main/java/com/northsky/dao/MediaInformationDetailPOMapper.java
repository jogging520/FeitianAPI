package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.MediaInformationDetailPO;

@Mapper
public interface MediaInformationDetailPOMapper {
    int deleteByPrimaryKey(Integer mediaDetailId);

    int insert(MediaInformationDetailPO record);

    int insertSelective(MediaInformationDetailPO record);

    MediaInformationDetailPO selectByPrimaryKey(Integer mediaDetailId);

    List<MediaInformationDetailPO> selectByMediaId(Integer mediaId);
    
    int updateByPrimaryKeySelective(MediaInformationDetailPO record);

    int updateByPrimaryKey(MediaInformationDetailPO record);
}