package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.ChannelProgrammeRelationPO;

@Mapper
public interface ChannelProgrammeRelationPOMapper {
    int deleteByPrimaryKey(Integer channelProgrammeId);

    int insert(ChannelProgrammeRelationPO record);

    int insertSelective(ChannelProgrammeRelationPO record);

    ChannelProgrammeRelationPO selectByPrimaryKey(Integer channelProgrammeId);
    
    List<ChannelProgrammeRelationPO> findByChannelId(Integer channelId);
    
    int updateByPrimaryKeySelective(ChannelProgrammeRelationPO record);

    int updateByPrimaryKey(ChannelProgrammeRelationPO record);
}