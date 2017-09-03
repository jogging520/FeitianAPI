package com.northsky.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.northsky.model.po.ChannelInformationPO;
import com.northsky.model.po.StationInformationPO;
import com.northsky.service.ChannnelService;
import com.northsky.service.StationService;

public class PlayList {
	@Autowired
    private StationService stationService;
	@Autowired
	private ChannnelService channelService;
	
	List<StationInformationPO> Stationlist = (List<StationInformationPO>) stationService.findAll();
	List<ChannelInformationPO> Channelist = (List<ChannelInformationPO>) channelService.findAll();
	
	
	
}
