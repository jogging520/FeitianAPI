package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.StationInformationPO;

@Mapper
public interface StationInformationMapper {
    @Select("SELECT * FROM station_Information where status = #{status}")
    List<StationInformationPO> getAllByStatus(@Param("status") int  status);
}
