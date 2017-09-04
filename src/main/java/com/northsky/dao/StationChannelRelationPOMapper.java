package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.StationChannelRelationPO;

@Mapper
public interface StationChannelRelationPOMapper {
    int deleteByPrimaryKey(Integer stationChannelId);

    int insert(StationChannelRelationPO record);

    int insertSelective(StationChannelRelationPO record);

    StationChannelRelationPO selectByPrimaryKey(Integer stationChannelId);

    List<StationChannelRelationPO> findByStationId(Integer stationId);
    
    int updateByPrimaryKeySelective(StationChannelRelationPO record);

    int updateByPrimaryKey(StationChannelRelationPO record);
}