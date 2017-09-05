package com.northsky.domain.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.northsky.dao.MediaInformationDetailPOMapper;
import com.northsky.dao.MediaInformationPOMapper;
import com.northsky.domain.IMediaDomain;
import com.northsky.model.po.MediaInformationDetailPO;
import com.northsky.model.po.MediaInformationPO;
import com.northsky.model.vo.MediaInformationVO;

@Component
public class MediaDomain implements IMediaDomain
{
	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private MediaInformationPOMapper mediaInformationPOMapper;
	@Autowired
	private MediaInformationDetailPOMapper mediaInformationDetailPOMapper;
	
	@Override
	public MediaInformationVO getMedia(int mediaId) throws Exception
	{
		if(mediaId <= 0)
			return null;
		
		MediaInformationVO mediaInformationVO = null;
		MediaInformationPO mediaInformationPO = null;
		List<MediaInformationDetailPO> mediaInformationDetailPOs = null;
		
		if(mediaInformationPOMapper == null)
			return null;
		
		if(mediaInformationDetailPOMapper == null)
			return null;
		
		mediaInformationPO = mediaInformationPOMapper.selectByPrimaryKey(mediaId);
		
		if(mediaInformationPO == null)
			return null;
		
		mediaInformationVO = mediaInformationPO.convertToVO();
		mediaInformationVO.setDetails(new HashMap<String, String>());
		
		mediaInformationDetailPOs = mediaInformationDetailPOMapper.selectByMediaId(mediaId);
		
		for(MediaInformationDetailPO mediaInformationDetailPO: mediaInformationDetailPOs)
		{
			mediaInformationVO.getDetails().put(mediaInformationDetailPO.getAttribute(), mediaInformationDetailPO.getValue());
		}			
		
		return mediaInformationVO;
	}
}
