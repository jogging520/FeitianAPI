package com.northsky.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.dao.ChannelInformationMapper;
import com.northsky.dao.ChannelProgrammeRelationMapper;
import com.northsky.dao.MediaInformationDetailMapper;
import com.northsky.dao.MediaInformationMapper;
import com.northsky.dao.ProgrammeInformationMapper;
import com.northsky.dao.StationChannelRelationMapper;
import com.northsky.dao.StationInformationMapper;
import com.northsky.model.po.ChannelInformationPO;
import com.northsky.model.po.ChannelProgrammeRelationPO;
import com.northsky.model.po.ProgrammeInformationPO;
import com.northsky.model.po.StationChannelRelationPO;
import com.northsky.model.po.StationInformationPO;
import com.northsky.model.vo.ChannelInformationVO;
import com.northsky.model.vo.PlayListVO;
import com.northsky.model.vo.ProgrammeInformationVO;
import com.northsky.model.vo.StationInformationVO;
@Service 
public class PlayListService {
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private ChannelInformationMapper channelInfoMapper;
   @Autowired
	private ChannelProgrammeRelationMapper channelproRelationMapper;
   @Autowired
	private MediaInformationDetailMapper mediaInfoDeilMapper;
   @Autowired
	private MediaInformationMapper mediaInfoMapper;
	
   @Autowired
	private ProgrammeInformationMapper progrommeMapper;
   @Autowired
	private StationChannelRelationMapper stationChannelRelaitonMapper;
   @Autowired
	private StationInformationMapper stationInfoMapper;
   
   public PlayListVO getPlaylist() {
	   PlayListVO playlistVO = new PlayListVO();
	   List<ChannelProgrammeRelationPO>  channelProgremmeRelationList =null;
	   List<StationChannelRelationPO>  stationChanelRelationList =null;
	   List<StationInformationPO>  stationInfoList =stationInfoMapper.getAllByStatus(1);
	   
	   System.out.println("----" + stationInfoList.size());
	   
	   List<StationInformationVO> stations = new ArrayList<StationInformationVO>();
	   for(int i=0;i<stationInfoList.size();i++)
	   {
		   StationInformationVO stationVO = new StationInformationVO();
		   stationVO.setCategory(stationInfoList.get(i).getCategory());
		   stationVO.setDescription(stationInfoList.get(i).getDescription());
		   System.out.println("----" + stationInfoList.get(i).getCategory());
		   System.out.println("----" + stationInfoList.get(i).getDescription());
		   System.out.println("----" + stationInfoList.get(i).getTitle());
		   System.out.println("----" + stationInfoList.get(i).getType());
		   System.out.println("----" + stationInfoList.get(i).getCreateTime());
		   Integer mediaId =stationInfoList.get(i).getLogoMediaId();
		   System.out.println("mediaId----" + mediaId.intValue());
		   
		   String location = mediaInfoMapper.findByid(mediaId).getLocaion();
		   stationVO.setLogoMedia(location);
		   stationVO.setName(stationInfoList.get(i).getName());
		   stationVO.setTitle(stationInfoList.get(i).getTitle());
		   stationVO.setType(stationInfoList.get(i).getType());
		   List<ChannelInformationVO> channels = new ArrayList<ChannelInformationVO>();
		   
		   stationChanelRelationList =stationChannelRelaitonMapper.findByStationId(stationInfoList.get(i).getStationId());
		   for(int j=0;j<stationChanelRelationList.size();j++)
		   {
		         ChannelInformationVO channelVO =new ChannelInformationVO();
		         int channelId = stationChanelRelationList.get(j).getChannelId();
		         
		         ChannelInformationPO channelInformationPO = channelInfoMapper.findByChannelId(channelId);
		         
		         channelVO.setCategory(channelInformationPO.getCategory());
		         channelVO.setDescription(channelInformationPO.getDescription());
		         
		         int channelMediaId =channelInformationPO.getLogoMediaId();
				 String channellocation = mediaInfoMapper.findByid(channelMediaId).getLocaion();
		         channelVO.setLogoMedia(channellocation);
		         channelVO.setType(channelInformationPO.getType());
		         channelVO.setTitle(channelInformationPO.getTitle());
		         
		         channelProgremmeRelationList = channelproRelationMapper.findByChannelId(channelId);
		         List<ProgrammeInformationVO> programmes = new ArrayList<ProgrammeInformationVO>();
		         for(int k=0; k<channelProgremmeRelationList.size(); k++)
		         {
		        	 ProgrammeInformationVO programmeInformationVO = new ProgrammeInformationVO();
		        	 int programmeId = channelProgremmeRelationList.get(k).getProgrammeId();
		        	 ProgrammeInformationPO programmeInformationPO = progrommeMapper.findByProgrammeId(programmeId);
		        	 
		        	 programmeInformationVO.setCategory(programmeInformationPO.getCategory());
		        	 programmeInformationVO.setDescription(programmeInformationPO.getDescription());
		        	 programmeInformationVO.setName(programmeInformationPO.getName());
		        	 programmeInformationVO.setTitle(programmeInformationPO.getTitle());
		        	 programmeInformationVO.setType(programmeInformationPO.getType());
		        	 
		        	 int programmeMediaId =programmeInformationPO.getMediaId();
		        	 int programmeSnapshotMediaId = programmeInformationPO.getSnapshotMediaId();
					 String programmeMediaLocation = mediaInfoMapper.findByid(programmeMediaId).getLocaion();
					 String programmeSnapshotLocation = mediaInfoMapper.findByid(programmeSnapshotMediaId).getLocaion();
			         
					 programmeInformationVO.setMedia(programmeMediaLocation);
					 programmeInformationVO.setSnapshotMedia(programmeSnapshotLocation);
					 programmes.add(programmeInformationVO);
		         }
		         
		         channels.add(channelVO);
		       
		   }      		   
	        stations.add(stationVO);
  
	   }
	   playlistVO.setStations(stations);
       
       return playlistVO;
  
   }

}
