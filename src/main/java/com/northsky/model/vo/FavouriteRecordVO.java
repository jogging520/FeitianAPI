package com.northsky.model.vo;

import java.util.Date;

import com.northsky.model.po.FavouriteRecordPO;

public class FavouriteRecordVO
{
    private Integer partyId;

    private String media;

    private String type;

    private String last;

    private String description;

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}
	
	public FavouriteRecordPO converToPO()
	{
		FavouriteRecordPO favouriteRecordPO = new FavouriteRecordPO();
		
		favouriteRecordPO.setPartyId(this.getPartyId());
		favouriteRecordPO.setType(this.getType());
		favouriteRecordPO.setLast(this.getLast());
		favouriteRecordPO.setStatus(1);
		Date date = new Date();
		favouriteRecordPO.setCreateTime(date);
		favouriteRecordPO.setStatusTime(date);
		favouriteRecordPO.setDescription(this.getDescription());
		
		return favouriteRecordPO;
	}
}
