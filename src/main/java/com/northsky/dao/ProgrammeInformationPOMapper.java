package com.northsky.dao;

import com.northsky.model.po.ProgrammeInformationPO;

public interface ProgrammeInformationPOMapper {
    int deleteByPrimaryKey(Integer programmeId);

    int insert(ProgrammeInformationPO record);

    int insertSelective(ProgrammeInformationPO record);

    ProgrammeInformationPO selectByPrimaryKey(Integer programmeId);

    int updateByPrimaryKeySelective(ProgrammeInformationPO record);

    int updateByPrimaryKey(ProgrammeInformationPO record);
}