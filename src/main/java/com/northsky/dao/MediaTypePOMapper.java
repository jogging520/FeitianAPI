package com.northsky.dao;

import com.northsky.model.po.MediaTypePO;

public interface MediaTypePOMapper {
    int deleteByPrimaryKey(Integer mediaTypeId);

    int insert(MediaTypePO record);

    int insertSelective(MediaTypePO record);

    MediaTypePO selectByPrimaryKey(Integer mediaTypeId);

    int updateByPrimaryKeySelective(MediaTypePO record);

    int updateByPrimaryKey(MediaTypePO record);
}