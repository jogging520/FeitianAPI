package com.northsky.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.northsky.dao.FavouriteRecordPOMapper;
import com.northsky.dao.MediaInformationPOMapper;
import com.northsky.model.po.FavouriteRecordPO;
import com.northsky.model.po.MediaInformationPO;
import com.northsky.model.vo.FavouriteRecordVO;

@Component
public class FavouriteDomain 
{
	@Autowired
	private FavouriteRecordPOMapper favouriteRecordPOMapper;
	@Autowired
	private MediaInformationPOMapper mediaInformationPOMapper;
	
	public List<FavouriteRecordVO> getMedia(int partyId, String type) throws Exception
	{
		if(partyId <= 0)
			return null;
		
		if(type == null || type.equals(""))
			return null;
		
		List<FavouriteRecordVO> favouriteRecordVOs = null;
		List<FavouriteRecordPO> favouriteRecordPOs = null;
		FavouriteRecordVO favouriteRecordVO = null;		
		
		if(favouriteRecordPOMapper == null)
			return null;
		
		if(mediaInformationPOMapper == null)
			return null;
		
		favouriteRecordPOs = favouriteRecordPOMapper.selectByPartyId(partyId, type.toUpperCase());
		
		if(favouriteRecordPOs == null)
			return null;
		
		favouriteRecordVOs = new ArrayList<FavouriteRecordVO>();
		
		for(FavouriteRecordPO favouriteRecordPO: favouriteRecordPOs)
		{
			favouriteRecordVO = favouriteRecordPO.converToVO();
			favouriteRecordVO.setMedia(getMediaLocation(favouriteRecordPO.getMediaId()));
			
			favouriteRecordVOs.add(favouriteRecordVO);
		}		    	
		
		return favouriteRecordVOs;		
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
		
		return mediaInformationPO.getLocaion();
	}
}
