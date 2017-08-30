package com.northsky.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.northsky.domain.ImageLocation;
import com.northsky.domain.ImageLocationMapper;
import com.northsky.domain.User;


@Controller
public class WebController {
	
	@Autowired
	private ImageLocationMapper imageMapper;


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
    @RequestMapping(value="/getImage/{media_id}",method = RequestMethod.GET )
    @ResponseBody
    public String getImage(@PathVariable int media_id){
    	ImageLocation image = imageMapper.findByid(media_id);
    	JSONObject json=(JSONObject) JSON.toJSON(image);
    	return json.toJSONString();
    }
    
	
}