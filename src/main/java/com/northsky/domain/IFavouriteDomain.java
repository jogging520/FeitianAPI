package com.northsky.domain;

import java.util.List;

import com.northsky.model.vo.FavouriteRecordVO;

public interface IFavouriteDomain 
{
	public List<FavouriteRecordVO> getFavourite(int partyId, String type) throws Exception;
	
	public boolean enshrine(FavouriteRecordVO favouriteRecordVO) throws Exception;
}
