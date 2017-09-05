package com.northsky.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.domain.IPlayListDomain;
import com.northsky.model.vo.PlayListVO;
import com.northsky.model.vo.ServiceVO;
import com.northsky.service.IPlayListService;

@Service 
public class PlayListService implements IPlayListService
{	
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private IPlayListDomain playListDomain;
	
	private ServiceVO serviceVO = null;
	
	@Override
	public ServiceVO getMedia()
	{
		PlayListVO playListVO = null;
		
		try
    	{
			serviceVO = new ServiceVO();
			//TODO 按统一的格式来命名域
			serviceVO.setHeaderRequestDomain("APP");
			serviceVO.setHeaderResponseDomain("SERVER");
			
			if(playListDomain == null)
				return null;
			
			playListVO = playListDomain.getPlaylist();
		
			serviceVO.setBody(playListVO);
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
