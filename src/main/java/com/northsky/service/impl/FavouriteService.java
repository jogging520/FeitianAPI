package com.northsky.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.domain.IFavouriteDomain;
import com.northsky.model.vo.FavouriteRecordVO;
import com.northsky.model.vo.ServiceVO;
import com.northsky.service.IFavouriteService;

@Service 
public class FavouriteService implements IFavouriteService
{
	@Autowired
	private IFavouriteDomain favouriteDomain;
	
	private ServiceVO serviceVO = null;
	
	@Override
	public ServiceVO getFavourite(int partyId, String type)
	{
		List<FavouriteRecordVO> favouriteRecordVOs = null;
		
		try
		{		
			serviceVO = new ServiceVO();
			//TODO 按统一的格式来命名域
			serviceVO.setHeaderRequestDomain("APP");
			serviceVO.setHeaderResponseDomain("SERVER");
			
			if(partyId <= 0)
				return null;
			
			if(type == null || type.equals(""))
				return null;
			
			if(favouriteDomain == null)
				return null;
			
			//get类的如果没有exception，都按业务级成功处理。如果有exception，那么就根据exception类型来顶code和desc。
			//对外抛出的异常和内部的异常有所区分，内部更加详细。
			//domain及以下都不catchexception，由service层来catch，对于domain层的事务，在catch后再throw
			favouriteRecordVOs = favouriteDomain.getFavourite(partyId, type);
			
			serviceVO.setBody(favouriteRecordVOs);
			serviceVO.setHeaderResponseTime(new Date());
		}
		catch(Exception exception)
    	{
    		exception.printStackTrace();
    		serviceVO.setHeaderResponseCode("2999");
    		serviceVO.setHeaderResponseDescription("Error");
    		serviceVO.setHeaderRequestTime(new Date());
    	}
		
		return serviceVO;
	}
	
	public boolean appendFavourite(FavouriteRecordVO favouriteRecordVO)
	{
		boolean result = false;
		
		try
		{		
			serviceVO = new ServiceVO();
			//TODO 按统一的格式来命名域
			serviceVO.setHeaderRequestDomain("APP");
			serviceVO.setHeaderResponseDomain("SERVER");
			
			if(favouriteRecordVO == null)
				return result;
			
			if(favouriteDomain == null)
				return result;
			
			//get类的如果没有exception，都按业务级成功处理。如果有exception，那么就根据exception类型来顶code和desc。
			//对外抛出的异常和内部的异常有所区分，内部更加详细。
			//domain及以下都不catchexception，由service层来catch，对于domain层的事务，在catch后再throw
			result = favouriteDomain.appendFavourite(favouriteRecordVO);
			
			serviceVO.setBody(favouriteRecordVO);
			serviceVO.setHeaderResponseTime(new Date());
		}
		catch(Exception exception)
    	{
    		exception.printStackTrace();
    		serviceVO.setHeaderResponseCode("2999");
    		serviceVO.setHeaderResponseDescription("Error");
    		serviceVO.setHeaderRequestTime(new Date());
    	}
		
		return result;
	}
}
