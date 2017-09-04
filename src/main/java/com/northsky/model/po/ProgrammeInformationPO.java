package com.northsky.model.po;

import java.util.Date;

import com.northsky.model.vo.ProgrammeInformationVO;
public class ProgrammeInformationPO {
    private Integer programmeId;

    private String name;

    private String category;

    private String type;

    private String title;
    
    private Integer MediaId;

    private Integer snapshotMediaId;

    private Integer status;

    private Date createTime;

    private Date statusTime;

    private String description;

    public Integer getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Integer programmeId) {
        this.programmeId = programmeId;
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
		return MediaId;
	}

	public void setMediaId(Integer mediaId) {
		MediaId = mediaId;
	}

    public Integer getSnapshotMediaId() {
        return snapshotMediaId;
    }

    public void setSnapshotMediaId(Integer snapshotMediaId) {
        this.snapshotMediaId = snapshotMediaId;
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
    public ProgrammeInformationVO converToVO()
    {
    	ProgrammeInformationVO programmeInformationVO = null;
    	
    	try
    	{
    		programmeInformationVO = new ProgrammeInformationVO();
    		programmeInformationVO.setName(this.getName());
    		programmeInformationVO.setCategory(this.getCategory());
    		programmeInformationVO.setType(this.getType());
    		programmeInformationVO.setTitle(this.getTitle());
    		programmeInformationVO.setMedia(null);
    		programmeInformationVO.setSnapshotMedia(null);
    		programmeInformationVO.setDescription(this.getDescription());    		
    	}
    	catch(Exception exception)
    	{
    		exception.printStackTrace();
    	}
    	
    	return programmeInformationVO;
    }
}