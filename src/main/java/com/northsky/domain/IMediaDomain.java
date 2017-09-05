package com.northsky.domain;

import com.northsky.model.vo.MediaInformationVO;

public interface IMediaDomain 
{
	public MediaInformationVO getMedia(int mediaId) throws Exception;
}
