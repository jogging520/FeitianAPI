package com.northsky.web;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.northsky.model.po.Media;
import com.northsky.model.po.User;
import com.northsky.service.MediaService;


@Controller
public class WebController {

	@Autowired
	private MediaService mediaService;
	private Logger logger = Logger.getLogger(getClass());
	
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
    @RequestMapping(value="/hellojson",method = RequestMethod.GET )
    @ResponseBody
    public String helljson(ModelMap map) {
    	User user = new User();
    	user.setAge(10);
    	user.setId(1L);
    	user.setName("jk");
    	JSONObject json=(JSONObject) JSON.toJSON(user);
        return json.toJSONString();
    }
    @RequestMapping(value="/getMedia/{media_id}",method = RequestMethod.GET )
    @ResponseBody
    public JSONObject getMedia(@PathVariable int media_id){
    	Media media= mediaService.findById(media_id);
    	if(media!=null){
	    	JSONObject mediajson=(JSONObject) JSON.toJSON(media);
	    	logger.info("查询到数据，返回："+mediajson.toJSONString());
	       	return mediajson;
    	}else{
    		logger.info("没有查询到媒体数据，数据为空");
    		return null;
    	}
    	
    }
    
    @RequestMapping(value="/getMediaAll",method = RequestMethod.GET )
    @ResponseBody
    public List<JSONObject> getMediaAll(){
    	List<JSONObject> reslist =new ArrayList<JSONObject>();
    	List<Media> medialist =new ArrayList<Media>();
    	medialist = mediaService.getAll();
    	if(null!=medialist&&medialist.size()>0){
	    	for(int i=0;i<medialist.size();i++){
	    		JSONObject mediajson=(JSONObject) JSON.toJSON(medialist.get(i));
	    		reslist.add(mediajson);
	    	}
	    	logger.info("查询成功！返回json列表");
	       	return reslist;
    	}else{
    		logger.info("没有查询到媒体数据，数据为空");
    		return reslist;
    	}
    	
    }
	
}