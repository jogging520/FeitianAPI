package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.ChannelInformationPO;

@Mapper
public interface ChannelInformationMapper {

	 @Select("SELECT * FROM Channel_Information where status = 1")
	   List<ChannelInformationPO> findAll() ;
}
