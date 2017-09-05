package com.northsky.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.domain.SliderDomain;
import com.northsky.model.vo.ServiceVO;
import com.northsky.model.vo.SliderInformationVO;

@Service 
public class SliderService 
{
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private SliderDomain sliderDomain;
	
	private ServiceVO serviceVO = null;
	
	public ServiceVO getSlider(String category, String type)
	{
		if(category == null || category.equals(""))
			return null;
		
		if(type == null || type.equals(""))
			return null;
		
		List<SliderInformationVO> sliderInformationVOs = null;
		
		try
    	{
			serviceVO = new ServiceVO();
			//TODO 按统一的格式来命名域
			serviceVO.setHeaderRequestDomain("APP");
			serviceVO.setHeaderResponseDomain("SERVER");
			
			if(sliderDomain == null)
				return null;
			
			sliderInformationVOs = sliderDomain.getSlider(category, type);
		
			serviceVO.setBody(sliderInformationVOs);
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
