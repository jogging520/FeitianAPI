package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.MediaInformationDetailPO;

@Mapper
public interface MediaInformationDetailMapper 
{
	@Select("SELECT * FROM media_information_detail where media_detail_id = #{media_detail_id}")
    MediaInformationDetailPO findByMediaDetailId(@Param("media_detail_id") int media_detail_id);
	
	@Select("SELECT * FROM media_information_detail where media_id = #{media_id} and status = #{status}")
	List<MediaInformationDetailPO> findByMediaId(@Param("media_id") int  media_id, @Param("status") int  status);
    
    @Select("SELECT * FROM media_information_detail where status = #{status}")
    List<MediaInformationDetailPO> getAllByStatus(@Param("status") int  status);
}
