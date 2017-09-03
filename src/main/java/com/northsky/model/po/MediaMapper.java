package com.northsky.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MediaMapper {

    @Select("SELECT * FROM media_information where media_id = #{media_id}")
    Media findByid(@Param("media_id") int  media_id);
    @Select("SELECT * FROM media_information")
    List<Media> getAll();

}