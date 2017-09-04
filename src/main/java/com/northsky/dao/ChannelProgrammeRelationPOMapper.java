package com.northsky.dao;

import java.util.List;

import com.northsky.model.po.ChannelProgrammeRelationPO;

public interface ChannelProgrammeRelationPOMapper {
    int deleteByPrimaryKey(Integer channelProgrammeId);

    int insert(ChannelProgrammeRelationPO record);

    int insertSelective(ChannelProgrammeRelationPO record);

    ChannelProgrammeRelationPO selectByPrimaryKey(Integer channelProgrammeId);
    
    List<ChannelProgrammeRelationPO> findByChannelId(Integer channelId);
    
    int updateByPrimaryKeySelective(ChannelProgrammeRelationPO record);

    int updateByPrimaryKey(ChannelProgrammeRelationPO record);
}