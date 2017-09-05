package com.northsky.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.domain.FavouriteDomain;
import com.northsky.model.vo.FavouriteRecordVO;
import com.northsky.model.vo.ServiceVO;

@Service 
public class FavouriteService 
{
	@Autowired
	private FavouriteDomain favouriteDomain;
	
	private ServiceVO serviceVO = null;
	
	public ServiceVO getMedia(int partyId, String type)
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
			//domain及以下都不catchexception，由service层来catch
			favouriteRecordVOs = favouriteDomain.getMedia(partyId, type);
			
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
}