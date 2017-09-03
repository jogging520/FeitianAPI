package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.StationChannelRelationPO;

@Mapper
public interface StationChannelRelationMapper 
{
	@Select("SELECT * FROM station_channel_relation where station_id = #{station_id}")
    List<StationChannelRelationPO> findByStationId(@Param("station_id") int  station_id);
	
	@Select("SELECT * FROM station_channel_relation where channel_id = #{channel_id}")
	List<StationChannelRelationPO> findByChannelId(@Param("channel_id") int  channel_id);
}
