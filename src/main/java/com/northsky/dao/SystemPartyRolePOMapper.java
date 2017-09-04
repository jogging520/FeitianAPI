package com.northsky.dao;

import com.northsky.model.po.SystemPartyRolePO;

public interface SystemPartyRolePOMapper {
    int deleteByPrimaryKey(Integer partyRoleId);

    int insert(SystemPartyRolePO record);

    int insertSelective(SystemPartyRolePO record);

    SystemPartyRolePO selectByPrimaryKey(Integer partyRoleId);

    int updateByPrimaryKeySelective(SystemPartyRolePO record);

    int updateByPrimaryKey(SystemPartyRolePO record);
}