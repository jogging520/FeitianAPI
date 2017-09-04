package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.OperationRecordDetailPO;
@Mapper
public interface OperationRecordDetailPOMapper {
    int deleteByPrimaryKey(Long operationDetailId);

    int insert(OperationRecordDetailPO record);

    int insertSelective(OperationRecordDetailPO record);

    OperationRecordDetailPO selectByPrimaryKey(Long operationDetailId);

    int updateByPrimaryKeySelective(OperationRecordDetailPO record);

    int updateByPrimaryKey(OperationRecordDetailPO record);
}