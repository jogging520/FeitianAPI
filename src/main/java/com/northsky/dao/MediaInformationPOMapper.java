package com.northsky.dao;

import com.northsky.model.po.MediaInformationPO;

public interface MediaInformationPOMapper {
    int deleteByPrimaryKey(Integer mediaId);

    int insert(MediaInformationPO record);

    int insertSelective(MediaInformationPO record);

    MediaInformationPO selectByPrimaryKey(Integer mediaId);

    int updateByPrimaryKeySelective(MediaInformationPO record);

    int updateByPrimaryKey(MediaInformationPO record);
}