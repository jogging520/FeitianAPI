package com.northsky.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.dao.ChannelInformationMapper;
import com.northsky.dao.ChannelProgrammeRelationMapper;
import com.northsky.dao.MediaInformationMapper;
import com.northsky.dao.ProgrammeInformationMapper;
import com.northsky.dao.StationChannelRelationMapper;
import com.northsky.dao.StationInformationMapper;
import com.northsky.model.po.ChannelInformationPO;
import com.northsky.model.po.ChannelProgrammeRelationPO;
import com.northsky.model.po.MediaInformationPO;
import com.northsky.model.po.ProgrammeInformationPO;
import com.northsky.model.po.StationChannelRelationPO;
import com.northsky.model.po.StationInformationPO;
import com.northsky.model.vo.ChannelInformationVO;
import com.northsky.model.vo.PlayListVO;
import com.northsky.model.vo.ProgrammeInformationVO;
import com.northsky.model.vo.StationInformationVO;

@Service 
public class PlayListService 
{	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ChannelInformationMapper channelInformationMapper;
	@Autowired
	private ChannelProgrammeRelationMapper channelProgrammeRelationMapper;
	@Autowired
	private MediaInformationMapper mediaInformationMapper;	
	@Autowired
	private ProgrammeInformationMapper programmeInformationMapper;
	@Autowired
	private StationChannelRelationMapper stationChannelRelationMapper;
	@Autowired
	private StationInformationMapper stationInformationMapper;
	
	private static final int status = 1;

	
	public PlayListVO getPlaylist() 
	{
		PlayListVO playListVO = null;
		List<StationInformationPO> stationInformationPOs = null;
		List<StationInformationVO> stationInformationVOs = null;
		List<StationChannelRelationPO> stationChannelRelationPOs = null;
		List<ChannelInformationVO> channelInformationVOs = null;
		List<ChannelProgrammeRelationPO> channelProgrammeRelationPOs = null;
		List<ProgrammeInformationVO> programmeInformationVOs = null;
		StationInformationVO stationInformationVO = null;
		ChannelInformationVO channelInformationVO = null;
		ChannelInformationPO channelInformationPO = null;
		ProgrammeInformationVO programmeInformationVO = null;
		ProgrammeInformationPO programmeInformationPO = null;
				
		try
		{
			if(stationInformationMapper == null)
				return playListVO;
						
			if(stationChannelRelationMapper == null)
				return playListVO;
			
			if(channelInformationMapper == null)
				return playListVO;
			
			if(channelProgrammeRelationMapper == null)
				return playListVO;
			
			if(programmeInformationMapper == null)
				return playListVO;
			
			playListVO = new PlayListVO();
			
			stationInformationVOs = new ArrayList<StationInformationVO>();
			stationInformationPOs = stationInformationMapper.getAllByStatus(status);
			playListVO.setStations(stationInformationVOs);	
			
			for(StationInformationPO stationInformationPO: stationInformationPOs)
			{
				stationInformationVO = stationInformationPO.converToVO();
				stationInformationVO.setLogoMedia(getMediaLocation(stationInformationPO.getLogoMediaId()));
				
				stationChannelRelationPOs = stationChannelRelationMapper.findByStationId(stationInformationPO.getStationId());
				channelInformationVOs = new ArrayList<ChannelInformationVO>();
				stationInformationVO.setChannels(channelInformationVOs);
				
				for(StationChannelRelationPO stationChannelRelationPO: stationChannelRelationPOs)
				{
					channelInformationPO = channelInformationMapper.findByChannelId(stationChannelRelationPO.getChannelId());
					channelInformationVO = channelInformationPO.converToVO();
					channelInformationVO.setLogoMedia(getMediaLocation(channelInformationPO.getLogoMediaId()));
					
					channelProgrammeRelationPOs = channelProgrammeRelationMapper.findByChannelId(channelInformationPO.getChannelId());
					programmeInformationVOs = new ArrayList<ProgrammeInformationVO>();
					channelInformationVO.setProgrammes(programmeInformationVOs);
					
					for(ChannelProgrammeRelationPO channelProgrammeRelationPO: channelProgrammeRelationPOs)
					{
						programmeInformationPO = programmeInformationMapper.findByProgrammeId(channelProgrammeRelationPO.getProgrammeId());
						programmeInformationVO = programmeInformationPO.converToVO();
						programmeInformationVO.setMedia(getMediaLocation(programmeInformationPO.getMediaId()));
						programmeInformationVO.setSnapshotMedia(getMediaLocation(programmeInformationPO.getSnapshotMediaId()));
						
						programmeInformationVOs.add(programmeInformationVO);
					}
					
					channelInformationVOs.add(channelInformationVO);
				}
				
				stationInformationVOs.add(stationInformationVO);
			}
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			logger.info("----------");
		}
		
		return playListVO;
	}
	
	private String getMediaLocation(int mediaId)
	{
		if(mediaId <= 0)
			return null;
		
		if(mediaInformationMapper == null)
			return null;
		
		MediaInformationPO mediaInformationPO = mediaInformationMapper.findByid(mediaId);
		
		if(mediaInformationPO == null)
			return null;
		
		return mediaInformationPO.getLocaion();
	}
}
