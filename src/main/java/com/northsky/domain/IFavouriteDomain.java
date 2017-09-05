package com.northsky.domain;

import java.util.List;

import com.northsky.model.vo.FavouriteRecordVO;

public interface IFavouriteDomain 
{
	public List<FavouriteRecordVO> getMedia(int partyId, String type) throws Exception;
	
	
}
