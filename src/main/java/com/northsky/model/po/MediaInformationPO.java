package com.northsky.model.po;

import java.util.Date;

import com.northsky.model.vo.MediaInformationVO;

public class MediaInformationPO {
    private Integer mediaId;

    private String name;

    private String category;

    private String type;

    private String storeType;

    private String location;

    private Long size;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    
    public MediaInformationVO convertToVO()
    {
    	MediaInformationVO mediaInformationVO = null;
    	
    	try
    	{
    		mediaInformationVO = new MediaInformationVO();
    		mediaInformationVO.setName(this.getName());
    		mediaInformationVO.setCategory(this.getCategory());
    		mediaInformationVO.setType(this.getType());
    		mediaInformationVO.setStoreType(this.getStoreType());
    		mediaInformationVO.setLocation(this.getLocation());
    		mediaInformationVO.setSize(this.getSize());
    		mediaInformationVO.setDescription(this.getDescription());
    	}
    	catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
    	
    	return mediaInformationVO;
    }
}