package com.northsky.domain.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.northsky.dao.FavouriteRecordPOMapper;
import com.northsky.dao.MediaInformationPOMapper;
import com.northsky.dao.RecordSequencePOMapper;
import com.northsky.domain.IFavouriteDomain;
import com.northsky.model.po.FavouriteRecordPO;
import com.northsky.model.po.MediaInformationPO;
import com.northsky.model.vo.FavouriteRecordVO;

@Component
public class FavouriteDomain implements IFavouriteDomain
{
	@Autowired
	private FavouriteRecordPOMapper favouriteRecordPOMapper;
	@Autowired
	private MediaInformationPOMapper mediaInformationPOMapper;
	@Autowired
	private RecordSequencePOMapper recordSequencePOMapper;
	
	@Override
	public List<FavouriteRecordVO> getFavourite(int partyId, String type) throws Exception
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
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean appendFavourite(FavouriteRecordVO favouriteRecordVO) throws Exception
	{
		boolean result = false;
		FavouriteRecordPO favouriteRecordPO = null;
		long favouriteId = 0L;
		
		try
		{
			if(recordSequencePOMapper == null)
				return result;
			
			if(favouriteRecordPOMapper == null)
				return result;
			
			favouriteRecordPO = favouriteRecordVO.converToPO();
			
			favouriteId = recordSequencePOMapper.nextval();
			
			favouriteRecordPO.setFavouriteId(favouriteId);
			
			favouriteRecordPO.setMediaId(getMediaId(favouriteRecordVO.getMedia()));
			
			if(favouriteRecordPOMapper.insert(favouriteRecordPO) < 0)
			{
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
		}
		catch(Exception exception)
		{
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		
		return result;
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
	
	private int getMediaId(String location) throws Exception
	{
		if(location == null || location.equals(""))
			return -1;
		
		if(mediaInformationPOMapper == null)
			return -1;
		
		return mediaInformationPOMapper.selectByLocation(location);
	}
}
