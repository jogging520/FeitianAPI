package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SystemRolePO;
@Mapper
public interface SystemRolePOMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SystemRolePO record);

    int insertSelective(SystemRolePO record);

    SystemRolePO selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(SystemRolePO record);

    int updateByPrimaryKey(SystemRolePO record);
}