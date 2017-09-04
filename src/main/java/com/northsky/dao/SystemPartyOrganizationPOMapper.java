package com.northsky.dao;

import com.northsky.model.po.SystemPartyOrganizationPO;

public interface SystemPartyOrganizationPOMapper {
    int deleteByPrimaryKey(Integer partyOrganizationId);

    int insert(SystemPartyOrganizationPO record);

    int insertSelective(SystemPartyOrganizationPO record);

    SystemPartyOrganizationPO selectByPrimaryKey(Integer partyOrganizationId);

    int updateByPrimaryKeySelective(SystemPartyOrganizationPO record);

    int updateByPrimaryKey(SystemPartyOrganizationPO record);
}