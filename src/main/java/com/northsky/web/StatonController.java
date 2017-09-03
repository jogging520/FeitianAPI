package com.northsky.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.northsky.service.StationService;

@Controller
public class StatonController {
	@Autowired
	private StationService statinService;
	private Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping(value="/getStationAll",method = RequestMethod.GET )
    @ResponseBody
    public JSONObject  getMediaAll(){
        
		JSONObject stationjason = statinService.findAll();
    	
		return stationjason; 
    }
}
