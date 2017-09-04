package com.northsky.model.po;

import java.util.Date;

import com.northsky.model.vo.FavouriteRecordVO;

public class FavouriteRecordPO {
    private Long favouriteId;

    private Integer partyId;

    private Integer mediaId;

    private String type;

    private String last;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Long getFavouriteId() {
        return favouriteId;
    }

    public void setFavouriteId(Long favouriteId) {
        this.favouriteId = favouriteId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getMediaId() {
        return mediaId;
    }

    public void setMediaId(Integer mediaId) {
        this.mediaId = mediaId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last == null ? null : last.trim();
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
    public FavouriteRecordVO converToVO()
    {
    	FavouriteRecordVO favouriteRecordVO = null;
    	
    	try
    	{
    		favouriteRecordVO = new FavouriteRecordVO();
    		favouriteRecordVO.setPartyId(this.getPartyId());
    		favouriteRecordVO.setType(this.getType());
    		favouriteRecordVO.setLast(this.getLast());
    		favouriteRecordVO.setDescription(this.getDescription());
    	}
    	catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
    	
    	return favouriteRecordVO;
    }
}