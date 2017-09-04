package com.northsky.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.dao.FavouriteRecordPOMapper;
import com.northsky.dao.MediaInformationPOMapper;
import com.northsky.model.po.FavouriteRecordPO;
import com.northsky.model.po.MediaInformationPO;
import com.northsky.model.vo.FavouriteRecordVO;

@Service 
public class FavouriteService 
{
	@Autowired
	private FavouriteRecordPOMapper favouriteRecordPOMapper;
	@Autowired
	private MediaInformationPOMapper mediaInformationPOMapper;
	
	public List<FavouriteRecordVO> getMedia(int partyId, String type)
	{
		if(partyId <= 0)
			return null;
		
		if(type == null || type.equals(""))
			return null;
		
		List<FavouriteRecordVO> favouriteRecordVOs = null;
		List<FavouriteRecordPO> favouriteRecordPOs = null;
		FavouriteRecordVO favouriteRecordVO = null;
		
		try
    	{
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
    	}
		catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
		
		return favouriteRecordVOs;		
	}
	
	private String getMediaLocation(int mediaId)
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
