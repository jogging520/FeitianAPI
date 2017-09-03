package com.northsky.model.po;

import java.util.Date;

public class StationChannelRelationPO {
    private Integer stationChannelId;

    private Integer stationId;

    private Integer channelId;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getStationChannelId() {
        return stationChannelId;
    }

    public void setStationChannelId(Integer stationChannelId) {
        this.stationChannelId = stationChannelId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
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
}