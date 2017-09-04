package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.StationInformationPO;

@Mapper
public interface StationInformationPOMapper {
    int deleteByPrimaryKey(Integer stationId);

    int insert(StationInformationPO record);

    int insertSelective(StationInformationPO record);

    StationInformationPO selectByPrimaryKey(Integer stationId);
    
    List<StationInformationPO> getAllByStatus(int status);

    int updateByPrimaryKeySelective(StationInformationPO record);

    int updateByPrimaryKey(StationInformationPO record);
}