package com.northsky.dao;

import com.northsky.model.po.OperationRecordDetailPO;

public interface OperationRecordDetailPOMapper {
    int deleteByPrimaryKey(Long operationDetailId);

    int insert(OperationRecordDetailPO record);

    int insertSelective(OperationRecordDetailPO record);

    OperationRecordDetailPO selectByPrimaryKey(Long operationDetailId);

    int updateByPrimaryKeySelective(OperationRecordDetailPO record);

    int updateByPrimaryKey(OperationRecordDetailPO record);
}