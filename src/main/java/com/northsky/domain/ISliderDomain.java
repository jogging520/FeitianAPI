package com.northsky.domain;

import java.util.List;

import com.northsky.model.vo.SliderInformationVO;

public interface ISliderDomain 
{
	public List<SliderInformationVO> getSlider(String category, String type) throws Exception;
}
