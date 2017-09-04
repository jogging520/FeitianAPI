package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SystemPartyPO;

@Mapper
public interface SystemPartyPOMapper {
    int deleteByPrimaryKey(Integer partyId);

    int insert(SystemPartyPO record);

    int insertSelective(SystemPartyPO record);

    SystemPartyPO selectByPrimaryKey(Integer partyId);

    int updateByPrimaryKeySelective(SystemPartyPO record);

    int updateByPrimaryKey(SystemPartyPO record);
}