package com.northsky.domain;

import org.apache.ibatis.annotations.*;

@Mapper
public interface ImageLocationMapper {

    @Select("SELECT * FROM media_information where media_id = #{media_id}")
    ImageLocation findByid(@Param("media_id") int  media_id);

}