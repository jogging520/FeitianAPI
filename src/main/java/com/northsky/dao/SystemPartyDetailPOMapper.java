package com.northsky.dao;

import com.northsky.model.po.SystemPartyDetailPO;

public interface SystemPartyDetailPOMapper {
    int deleteByPrimaryKey(Integer partyDetailId);

    int insert(SystemPartyDetailPO record);

    int insertSelective(SystemPartyDetailPO record);

    SystemPartyDetailPO selectByPrimaryKey(Integer partyDetailId);

    int updateByPrimaryKeySelective(SystemPartyDetailPO record);

    int updateByPrimaryKey(SystemPartyDetailPO record);
}