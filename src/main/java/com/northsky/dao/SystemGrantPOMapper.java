package com.northsky.dao;

import com.northsky.model.po.SystemGrantPO;

public interface SystemGrantPOMapper {
    int deleteByPrimaryKey(Integer grantId);

    int insert(SystemGrantPO record);

    int insertSelective(SystemGrantPO record);

    SystemGrantPO selectByPrimaryKey(Integer grantId);

    int updateByPrimaryKeySelective(SystemGrantPO record);

    int updateByPrimaryKey(SystemGrantPO record);
}