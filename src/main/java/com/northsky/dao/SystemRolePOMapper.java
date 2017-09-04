package com.northsky.dao;

import com.northsky.model.po.SystemRolePO;

public interface SystemRolePOMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SystemRolePO record);

    int insertSelective(SystemRolePO record);

    SystemRolePO selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(SystemRolePO record);

    int updateByPrimaryKey(SystemRolePO record);
}