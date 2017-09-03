package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.MediaInformationPO;

@Mapper
public interface MediaInformationMapper {

    @Select("SELECT * FROM media_information where media_id = #{media_id}")
    MediaInformationPO findByid(@Param("media_id") int  media_id);
    
    @Select("SELECT * FROM media_information where status = #{status}")
    List<MediaInformationPO> getAllByStatus(@Param("status") int  status);
}