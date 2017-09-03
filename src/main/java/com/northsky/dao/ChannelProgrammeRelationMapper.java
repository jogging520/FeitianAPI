package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.ChannelProgrammeRelationPO;

@Mapper
public interface ChannelProgrammeRelationMapper 
{
	@Select("SELECT * FROM channel_programme_relation where programme_id = #{programme_id}")
    List<ChannelProgrammeRelationPO> findByProgrammeId(@Param("programme_id") int  programme_id);
	
	@Select("SELECT * FROM channel_programme_relation where channel_id = #{channel_id}")
	List<ChannelProgrammeRelationPO> findByChannelId(@Param("channel_id") int  channel_id);
}
