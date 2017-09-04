package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SystemOrganizationPO;

@Mapper
public interface SystemOrganizationPOMapper {
    int deleteByPrimaryKey(Integer organizationId);

    int insert(SystemOrganizationPO record);

    int insertSelective(SystemOrganizationPO record);

    SystemOrganizationPO selectByPrimaryKey(Integer organizationId);

    int updateByPrimaryKeySelective(SystemOrganizationPO record);

    int updateByPrimaryKey(SystemOrganizationPO record);
}