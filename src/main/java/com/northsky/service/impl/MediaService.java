package com.northsky.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.domain.IMediaDomain;
import com.northsky.model.vo.MediaInformationVO;
import com.northsky.model.vo.ServiceVO;
import com.northsky.service.IMediaService;

@Service 
public class MediaService implements IMediaService
{
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private IMediaDomain mediaDomain;
	
	private ServiceVO serviceVO = null;
	
	@Override
	public ServiceVO getMedia(int mediaId)
	{
		if(mediaId <= 0)
			return null;
		
		MediaInformationVO mediaInformationVO = null;
		
		try
    	{
			serviceVO = new ServiceVO();
			//TODO 按统一的格式来命名域
			serviceVO.setHeaderRequestDomain("APP");
			serviceVO.setHeaderResponseDomain("SERVER");
			
			if(mediaDomain == null)
				return null;
			
			mediaInformationVO = mediaDomain.getMedia(mediaId);
		
			serviceVO.setBody(mediaInformationVO);
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
