package com.northsky.dao;

import com.northsky.model.po.FavouriteRecordPO;

public interface FavouriteRecordPOMapper {
    int deleteByPrimaryKey(Long favouriteId);

    int insert(FavouriteRecordPO record);

    int insertSelective(FavouriteRecordPO record);

    FavouriteRecordPO selectByPrimaryKey(Long favouriteId);

    int updateByPrimaryKeySelective(FavouriteRecordPO record);

    int updateByPrimaryKey(FavouriteRecordPO record);
}