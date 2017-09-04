package com.northsky.dao;

import com.northsky.model.po.ChannelInformationPO;

public interface ChannelInformationPOMapper {
    int deleteByPrimaryKey(Integer channelId);

    int insert(ChannelInformationPO record);

    int insertSelective(ChannelInformationPO record);

    ChannelInformationPO selectByPrimaryKey(Integer channelId);

    int updateByPrimaryKeySelective(ChannelInformationPO record);

    int updateByPrimaryKey(ChannelInformationPO record);
}