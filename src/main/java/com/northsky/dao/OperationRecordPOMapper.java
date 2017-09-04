package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.OperationRecordPO;

@Mapper
public interface OperationRecordPOMapper {
    int deleteByPrimaryKey(Long operationId);

    int insert(OperationRecordPO record);

    int insertSelective(OperationRecordPO record);

    OperationRecordPO selectByPrimaryKey(Long operationId);

    int updateByPrimaryKeySelective(OperationRecordPO record);

    int updateByPrimaryKey(OperationRecordPO record);
}