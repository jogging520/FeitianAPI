package com.northsky.dao;

import com.northsky.model.po.SystemParameterPO;

public interface SystemParameterPOMapper {
    int deleteByPrimaryKey(Integer parameterId);

    int insert(SystemParameterPO record);

    int insertSelective(SystemParameterPO record);

    SystemParameterPO selectByPrimaryKey(Integer parameterId);

    int updateByPrimaryKeySelective(SystemParameterPO record);

    int updateByPrimaryKey(SystemParameterPO record);
}