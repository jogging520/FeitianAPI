package com.northsky.domain.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.northsky.dao.ChannelInformationPOMapper;
import com.northsky.dao.ChannelProgrammeRelationPOMapper;
import com.northsky.dao.MediaInformationPOMapper;
import com.northsky.dao.ProgrammeInformationPOMapper;
import com.northsky.dao.StationChannelRelationPOMapper;
import com.northsky.dao.StationInformationPOMapper;
import com.northsky.domain.IPlayListDomain;
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

@Component
public class PlayListDomain implements IPlayListDomain
{
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ChannelInformationPOMapper channelInformationPOMapper;
	@Autowired
	private ChannelProgrammeRelationPOMapper channelProgrammeRelationPOMapper;
	@Autowired
	private MediaInformationPOMapper mediaInformationPOMapper;	
	@Autowired
	private ProgrammeInformationPOMapper programmeInformationPOMapper;
	@Autowired
	private StationChannelRelationPOMapper stationChannelRelationPOMapper;
	@Autowired
	private StationInformationPOMapper stationInformationPOMapper;
	
	private static final int status = 1;

	@Override
	public PlayListVO getPlaylist() throws Exception
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
		String location = null;
				
		if(stationInformationPOMapper == null)
			return playListVO;
					
		if(stationChannelRelationPOMapper == null)
			return playListVO;
		
		if(channelInformationPOMapper == null)
			return playListVO;
		
		if(channelProgrammeRelationPOMapper == null)
			return playListVO;
		
		if(programmeInformationPOMapper == null)
			return playListVO;
		
		playListVO = new PlayListVO();
		
		stationInformationVOs = new ArrayList<StationInformationVO>();
		stationInformationPOs = stationInformationPOMapper.getAllByStatus(status);
		playListVO.setStations(stationInformationVOs);	
		
		for(StationInformationPO stationInformationPO: stationInformationPOs)
		{
			stationInformationVO = stationInformationPO.converToVO();
			stationInformationVO.setLogoMedia(getMediaLocation(stationInformationPO.getLogoMediaId()));
			
			stationChannelRelationPOs = stationChannelRelationPOMapper.findByStationId(stationInformationPO.getStationId());
			channelInformationVOs = new ArrayList<ChannelInformationVO>();
			stationInformationVO.setChannels(channelInformationVOs);
			
			for(StationChannelRelationPO stationChannelRelationPO: stationChannelRelationPOs)
			{
				channelInformationPO = channelInformationPOMapper.selectByPrimaryKey(stationChannelRelationPO.getChannelId());
				channelInformationVO = channelInformationPO.converToVO();
				channelInformationVO.setLogoMedia(getMediaLocation(channelInformationPO.getLogoMediaId()));
				
				channelProgrammeRelationPOs = channelProgrammeRelationPOMapper.findByChannelId(channelInformationPO.getChannelId());
				programmeInformationVOs = new ArrayList<ProgrammeInformationVO>();
				channelInformationVO.setProgrammes(programmeInformationVOs);
				
				for(ChannelProgrammeRelationPO channelProgrammeRelationPO: channelProgrammeRelationPOs)
				{
					programmeInformationPO = programmeInformationPOMapper.selectByPrimaryKey(channelProgrammeRelationPO.getProgrammeId());
					programmeInformationVO = programmeInformationPO.converToVO();
					
					location = getMediaLocation(programmeInformationPO.getMediaId());					
					if(location == null)
						continue;
					
					programmeInformationVO.setMedia(location);
					
					location = getMediaLocation(programmeInformationPO.getSnapshotMediaId());
					if(location == null)
						continue;
					
					programmeInformationVO.setSnapshotMedia(location);
					
					programmeInformationVOs.add(programmeInformationVO);
				}
				
				channelInformationVOs.add(channelInformationVO);
			}
			
			stationInformationVOs.add(stationInformationVO);
		}
		
		return playListVO;
	}
	
	private String getMediaLocation(int mediaId) throws Exception
	{
		if(mediaId <= 0)
			return null;
		
		if(mediaInformationPOMapper == null)
			return null;
		
		MediaInformationPO mediaInformationPO = mediaInformationPOMapper.selectByPrimaryKey(mediaId);
		
		if(mediaInformationPO == null)
			return null;
		
		return mediaInformationPO.getLocation();
	}
}
