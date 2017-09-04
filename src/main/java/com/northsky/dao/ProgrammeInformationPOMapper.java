package com.northsky.dao;

import org.apache.ibatis.annotations.Mapper;

import com.northsky.model.po.ProgrammeInformationPO;
@Mapper
public interface ProgrammeInformationPOMapper {
    int deleteByPrimaryKey(Integer programmeId);

    int insert(ProgrammeInformationPO record);

    int insertSelective(ProgrammeInformationPO record);

    ProgrammeInformationPO selectByPrimaryKey(Integer programmeId);

    int updateByPrimaryKeySelective(ProgrammeInformationPO record);

    int updateByPrimaryKey(ProgrammeInformationPO record);
}