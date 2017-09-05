package com.northsky.model.po;

import java.util.Date;

import com.northsky.model.vo.SliderInformationVO;

public class SliderInformationPO {
    private Integer sliderId;

    private String name;

    private String category;

    private String type;

    private String title;

    private Integer mediaId;

    private Integer rank;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getSliderId() {
        return sliderId;
    }

    public void setSliderId(Integer sliderId) {
        this.sliderId = sliderId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
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
    
    /**
     * 方法：将PO对象转换成VO对象
     * @return
     */
    public SliderInformationVO converToVO()
    {
    	SliderInformationVO sliderInformationVO = null;
    	
    	try
    	{
    		sliderInformationVO = new SliderInformationVO();
    		sliderInformationVO.setName(this.getName());
    		sliderInformationVO.setCategory(this.getCategory());
    		sliderInformationVO.setType(this.getType());
    		sliderInformationVO.setTitle(this.getTitle());
    		sliderInformationVO.setMedia(null);
    		sliderInformationVO.setDescription(this.getDescription());
    	}
    	catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
    	
    	return sliderInformationVO;
    }
}