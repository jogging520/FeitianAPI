package com.northsky.dao;

import com.northsky.model.po.SystemPartyPO;

public interface SystemPartyPOMapper {
    int deleteByPrimaryKey(Integer partyId);

    int insert(SystemPartyPO record);

    int insertSelective(SystemPartyPO record);

    SystemPartyPO selectByPrimaryKey(Integer partyId);
    
    int selectByName(String name);

    int updateByPrimaryKeySelective(SystemPartyPO record);

    int updateByPrimaryKey(SystemPartyPO record);
}