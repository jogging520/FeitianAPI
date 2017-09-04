package com.northsky.dao;

import com.northsky.model.po.SystemOrganizationPO;

public interface SystemOrganizationPOMapper {
    int deleteByPrimaryKey(Integer organizationId);

    int insert(SystemOrganizationPO record);

    int insertSelective(SystemOrganizationPO record);

    SystemOrganizationPO selectByPrimaryKey(Integer organizationId);

    int updateByPrimaryKeySelective(SystemOrganizationPO record);

    int updateByPrimaryKey(SystemOrganizationPO record);
}