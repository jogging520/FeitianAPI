package com.northsky.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.northsky.model.vo.MediaInformationVO;
import com.northsky.service.impl.MediaService;
@Controller
public class MediaController {
	@Autowired
	private MediaService MediaService;
	private Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping(value="/getMediaAll/{{media_id}}",method = RequestMethod.GET )
    @ResponseBody
    public JSONObject getMedia(@PathVariable int media_id){
		MediaInformationVO mediaInformationVO= MediaService.getMedia(media_id);
		JSONObject mediaJason = (JSONObject) JSON.toJSON(mediaInformationVO);
		return  mediaJason;
		
	}
	
	
}
