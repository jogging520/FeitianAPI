package com.northsky.model.po;

import java.util.Date;

public class ChannelProgrammeRelationPO {
    private Integer channelProgrammeId;

    private Integer channelId;

    private Integer programmeId;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getChannelProgrammeId() {
        return channelProgrammeId;
    }

    public void setChannelProgrammeId(Integer channelProgrammeId) {
        this.channelProgrammeId = channelProgrammeId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Integer programmeId) {
        this.programmeId = programmeId;
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