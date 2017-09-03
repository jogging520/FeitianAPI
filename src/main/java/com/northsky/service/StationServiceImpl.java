package com.northsky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.dao.StationInformationMapper;
import com.northsky.model.po.StationInformationPO;
@Service
public class StationServiceImpl implements StationService{
	
	@Autowired 
	private  StationInformationMapper stationMapper;

	@Override
	public List<StationInformationPO> findAll() {
		// TODO Auto-generated method stub
		return stationMapper.findAll();
	}
	

}
