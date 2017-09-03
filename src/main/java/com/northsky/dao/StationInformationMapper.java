package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.StationInformationPO;

@Mapper
public interface StationInformationMapper {
    @Select("SELECT * FROM Station_Information where status = 1")
    List<StationInformationPO> findAll() ;
}
