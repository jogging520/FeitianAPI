package com.northsky.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.dao.MediaInformationPOMapper;
import com.northsky.dao.SliderInformationPOMapper;
import com.northsky.model.po.MediaInformationPO;
import com.northsky.model.po.SliderInformationPO;
import com.northsky.model.vo.SliderInformationVO;

@Service 
public class SliderService 
{
	@Autowired
	private SliderInformationPOMapper sliderInformationPOMapper;
	@Autowired
	private MediaInformationPOMapper mediaInformationPOMapper;
	
	public List<SliderInformationVO> getSlider(String category, String type)
	{
		if(type == null || type.equals(""))
			return null;
		
		List<SliderInformationVO> sliderInformationVOs = null;
		List<SliderInformationPO> sliderInformationPOs = null;
		SliderInformationVO sliderInformationVO = null;
		
		try
    	{
			if(sliderInformationPOMapper == null)
				return null;
			
			if(mediaInformationPOMapper == null)
				return null;
			
			sliderInformationPOs = sliderInformationPOMapper.selectByType(category, type);
			
			if(sliderInformationPOs == null)
				return null;
			
			sliderInformationVOs = new ArrayList<SliderInformationVO>();
			
			for(SliderInformationPO sliderInformationPO: sliderInformationPOs)
			{
				sliderInformationVO = sliderInformationPO.converToVO();
				sliderInformationVO.setMedia(getMediaLocation(sliderInformationPO.getMediaId()));
				
				sliderInformationVOs.add(sliderInformationVO);
			}		
    	}
		catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
		
		return sliderInformationVOs;	
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
