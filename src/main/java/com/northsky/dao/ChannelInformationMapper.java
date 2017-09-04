package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.ChannelInformationPO;

@Mapper
public interface ChannelInformationMapper { 
	 
	@Select("SELECT * FROM channel_information where channel_id = #{channelId}")
	ChannelInformationPO findByChannelId(@Param("channelId") int  channelId);
	
	@Select("SELECT * FROM channel_information where status = #{status}")
	    List<ChannelInformationPO> getAllByStatus(@Param("status") int  status);
}
