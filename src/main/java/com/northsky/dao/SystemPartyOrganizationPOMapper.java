package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SystemPartyOrganizationPO;
@Mapper
public interface SystemPartyOrganizationPOMapper {
    int deleteByPrimaryKey(Integer partyOrganizationId);

    int insert(SystemPartyOrganizationPO record);

    int insertSelective(SystemPartyOrganizationPO record);

    SystemPartyOrganizationPO selectByPrimaryKey(Integer partyOrganizationId);

    int updateByPrimaryKeySelective(SystemPartyOrganizationPO record);

    int updateByPrimaryKey(SystemPartyOrganizationPO record);
}