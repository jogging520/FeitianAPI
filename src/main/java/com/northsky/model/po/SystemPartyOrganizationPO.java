package com.northsky.model.po;

import java.util.Date;

public class SystemPartyOrganizationPO {
    private Integer partyOrganizationId;

    private Integer partyId;

    private Integer organizationId;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getPartyOrganizationId() {
        return partyOrganizationId;
    }

    public void setPartyOrganizationId(Integer partyOrganizationId) {
        this.partyOrganizationId = partyOrganizationId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
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