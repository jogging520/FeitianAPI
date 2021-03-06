package com.northsky.model.po;

import java.util.Date;

import com.northsky.model.vo.ChannelInformationVO;

public class ChannelInformationPO 
{
    private Integer channelId;

    private String name;

    private String category;

    private String type;

    private String title;

    private Integer logoMediaId;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
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

    public Integer getLogoMediaId() {
        return logoMediaId;
    }

    public void setLogoMediaId(Integer logoMediaId) {
        this.logoMediaId = logoMediaId;
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
    public ChannelInformationVO converToVO()
    {
    	ChannelInformationVO channelInformationVO = new ChannelInformationVO();
		channelInformationVO.setName(this.getName());
		channelInformationVO.setCategory(this.getCategory());
		channelInformationVO.setType(this.getType());
		channelInformationVO.setTitle(this.getTitle());
		channelInformationVO.setLogoMedia(null);
		channelInformationVO.setDescription(this.getDescription());
		channelInformationVO.setProgrammes(null);
    	
    	return channelInformationVO;
    }
}