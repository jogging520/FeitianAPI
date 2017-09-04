package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.FavouriteRecordPO;

@Mapper
public interface FavouriteRecordPOMapper 
{
    int deleteByPrimaryKey(Long favouriteId);

    int insert(FavouriteRecordPO record);

    int insertSelective(FavouriteRecordPO record);

    FavouriteRecordPO selectByPrimaryKey(Long favouriteId);
    
    List<FavouriteRecordPO> selectByPartyId(int partyId, String type);

    int updateByPrimaryKeySelective(FavouriteRecordPO record);

    int updateByPrimaryKey(FavouriteRecordPO record);
}