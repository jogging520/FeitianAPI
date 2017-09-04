package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.ChannelProgrammeRelationPO;

@Mapper
public interface ChannelProgrammeRelationMapper 
{
	@Select("SELECT * FROM channel_programme_relation where programme_id = #{programmeId}")
    List<ChannelProgrammeRelationPO> findByProgrammeId(@Param("programmeId") int  programmeId);
	
	@Select("SELECT * FROM channel_programme_relation where channel_id = #{channelId}")
	List<ChannelProgrammeRelationPO> findByChannelId(@Param("channelId") int  channelId);
}
