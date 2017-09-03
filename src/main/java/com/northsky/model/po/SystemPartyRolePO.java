package com.northsky.model.po;

import java.util.Date;

public class SystemPartyRolePO {
    private Integer partyRoleId;

    private Integer partyId;

    private Integer roleId;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getPartyRoleId() {
        return partyRoleId;
    }

    public void setPartyRoleId(Integer partyRoleId) {
        this.partyRoleId = partyRoleId;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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