package com.northsky.web;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.northsky.model.vo.FavouriteRecordVO;
import com.northsky.service.impl.FavouriteService;
@Controller
public class FavorivateController {
	@Autowired
	private FavouriteService favouriteService;
	private Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping(value="/getFavoriateAll",method = RequestMethod.GET )
    @ResponseBody
    public List<JSONObject>  getFavoriteAll(){
		logger.info(System.currentTimeMillis());
		List<FavouriteRecordVO> favourites = favouriteService.getMedia(88888888, "image");
		List<JSONObject> jaons =new ArrayList<JSONObject>();
		for(FavouriteRecordVO favouriteVO :favourites){
			JSONObject favorJason = (JSONObject) JSON.toJSON(favouriteVO);
			jaons.add(favorJason);
		}
		
		logger.info(System.currentTimeMillis());
		return jaons;
    }
	
	
}
