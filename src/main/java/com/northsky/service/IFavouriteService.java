package com.northsky.service;

import com.northsky.model.vo.ServiceVO;

public interface IFavouriteService 
{
	public ServiceVO getFavourite(int partyId, String type);
}
