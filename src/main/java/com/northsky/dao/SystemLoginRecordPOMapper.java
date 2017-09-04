package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.SystemLoginRecordPO;
@Mapper
public interface SystemLoginRecordPOMapper {
    int deleteByPrimaryKey(Long loginId);

    int insert(SystemLoginRecordPO record);

    int insertSelective(SystemLoginRecordPO record);

    SystemLoginRecordPO selectByPrimaryKey(Long loginId);

    int updateByPrimaryKeySelective(SystemLoginRecordPO record);

    int updateByPrimaryKey(SystemLoginRecordPO record);
}