package com.northsky.dao;

import com.northsky.model.po.SystemSessionPO;

public interface SystemSessionPOMapper {
    int deleteByPrimaryKey(Long sessionId);

    int insert(SystemSessionPO record);

    int insertSelective(SystemSessionPO record);

    SystemSessionPO selectByPrimaryKey(Long sessionId);

    int updateByPrimaryKeySelective(SystemSessionPO record);

    int updateByPrimaryKey(SystemSessionPO record);
}