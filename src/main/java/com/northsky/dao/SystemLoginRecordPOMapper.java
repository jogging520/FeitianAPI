package com.northsky.dao;

import com.northsky.model.po.SystemLoginRecordPO;

public interface SystemLoginRecordPOMapper {
    int deleteByPrimaryKey(Long loginId);

    int insert(SystemLoginRecordPO record);

    int insertSelective(SystemLoginRecordPO record);

    SystemLoginRecordPO selectByPrimaryKey(Long loginId);

    int updateByPrimaryKeySelective(SystemLoginRecordPO record);

    int updateByPrimaryKey(SystemLoginRecordPO record);
}