package com.northsky.dao;

import java.util.List;

import com.northsky.model.po.StationChannelRelationPO;

public interface StationChannelRelationPOMapper {
    int deleteByPrimaryKey(Integer stationChannelId);

    int insert(StationChannelRelationPO record);

    int insertSelective(StationChannelRelationPO record);

    StationChannelRelationPO selectByPrimaryKey(Integer stationChannelId);

    List<StationChannelRelationPO> findByStationId(Integer stationId);
    
    int updateByPrimaryKeySelective(StationChannelRelationPO record);

    int updateByPrimaryKey(StationChannelRelationPO record);
}