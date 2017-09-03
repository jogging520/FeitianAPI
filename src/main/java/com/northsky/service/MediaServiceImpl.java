package com.northsky.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northsky.model.po.Media;
import com.northsky.model.po.MediaMapper;

@Service
public class MediaServiceImpl implements MediaService{

	@Autowired
	private MediaMapper mediaMapper;
	
	@Override
	public void create(Media media) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Media findById(int id) {
		Media media = mediaMapper.findByid(id);
		return media;
	}

	@Override
	public List<Media> getAll() {
        List<Media> list =new ArrayList<Media>();
        list = mediaMapper.getAll();
		return list;
	}

	
}
