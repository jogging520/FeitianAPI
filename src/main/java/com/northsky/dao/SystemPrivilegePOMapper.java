package com.northsky.dao;

import com.northsky.model.po.SystemPrivilegePO;

public interface SystemPrivilegePOMapper {
    int deleteByPrimaryKey(Integer privilegeId);

    int insert(SystemPrivilegePO record);

    int insertSelective(SystemPrivilegePO record);

    SystemPrivilegePO selectByPrimaryKey(Integer privilegeId);

    int updateByPrimaryKeySelective(SystemPrivilegePO record);

    int updateByPrimaryKey(SystemPrivilegePO record);
}