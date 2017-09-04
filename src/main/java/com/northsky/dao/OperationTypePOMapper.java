package com.northsky.dao;

import com.northsky.model.po.OperationTypePO;

public interface OperationTypePOMapper {
    int deleteByPrimaryKey(Integer operationTypeId);

    int insert(OperationTypePO record);

    int insertSelective(OperationTypePO record);

    OperationTypePO selectByPrimaryKey(Integer operationTypeId);

    int updateByPrimaryKeySelective(OperationTypePO record);

    int updateByPrimaryKey(OperationTypePO record);
}