package com.northsky.service;

import java.util.List;

import com.northsky.model.po.Media;

/**  
* @ClassName: MediaService  
* @Description: 多媒体文件（图片、视频）服务
* @author wq
* @date 2017年9月1日 下午4:05:23  
*    
*/
public interface MediaService {
	
    void create(Media media);

    
    void deleteById(int  id);


    Media findById(int id);
    
    List<Media> getAll();

}
