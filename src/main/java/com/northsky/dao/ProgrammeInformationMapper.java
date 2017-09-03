package com.northsky.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.northsky.model.po.ProgrammeInformationPO;

@Mapper
public interface ProgrammeInformationMapper 
{
	@Select("SELECT * FROM programme_information where programme_id = #{programme_id}")
    ProgrammeInformationPO findByProgrammeId(@Param("programme_id") int  programme_id);
	
	@Select("SELECT * FROM programme_information where status = #{status}")
    List<ProgrammeInformationPO> getAllByStatus(@Param("status") int  status);
}
