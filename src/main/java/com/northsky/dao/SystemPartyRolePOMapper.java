package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SystemPartyRolePO;
@Mapper
public interface SystemPartyRolePOMapper {
    int deleteByPrimaryKey(Integer partyRoleId);

    int insert(SystemPartyRolePO record);

    int insertSelective(SystemPartyRolePO record);

    SystemPartyRolePO selectByPrimaryKey(Integer partyRoleId);

    int updateByPrimaryKeySelective(SystemPartyRolePO record);

    int updateByPrimaryKey(SystemPartyRolePO record);
}