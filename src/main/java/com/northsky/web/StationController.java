package com.northsky.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.northsky.model.vo.PlayListVO;
import com.northsky.service.impl.PlayListService;

@Controller
public class StationController {
	@Autowired 
	private PlayListService playListService;
	private Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping(value="/getStationAll",method = RequestMethod.GET )
    @ResponseBody
    public JSONObject  getMediaAll(){
		logger.info(System.currentTimeMillis());
		PlayListVO playvo = playListService.getPlaylist();
		
		JSONObject stationJason = (JSONObject) JSON.toJSON(playvo);
		logger.info(System.currentTimeMillis());
		return stationJason;
    }
}
