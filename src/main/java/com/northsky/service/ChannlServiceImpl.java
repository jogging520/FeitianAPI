package com.northsky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.dao.ChannelInformationMapper;
import com.northsky.model.po.ChannelInformationPO;
@Service
public class ChannlServiceImpl implements ChannnelService{
	
	@Autowired 
	private  ChannelInformationMapper channelMapper;

	@Override
	public List<ChannelInformationPO> findAll() {
		return channelMapper.findAll();
	}

}

