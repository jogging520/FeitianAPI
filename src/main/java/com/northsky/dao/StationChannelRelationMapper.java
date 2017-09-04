package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.StationChannelRelationPO;

@Mapper
public interface StationChannelRelationMapper 
{
	@Select("SELECT * FROM station_channel_relation where station_id = #{stationId}")
    List<StationChannelRelationPO> findByStationId(@Param("stationId") int stationId);
	
	@Select("SELECT * FROM station_channel_relation where channel_id = #{channelId}")
	List<StationChannelRelationPO> findByChannelId(@Param("channelId") int channelId);
}
