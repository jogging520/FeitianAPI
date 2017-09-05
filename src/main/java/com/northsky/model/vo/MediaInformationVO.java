package com.northsky.model.vo;

import java.util.Map;

public class MediaInformationVO
{
    private String name;

    private String category;

    private String type;

    private String storeType;

    private String location;

    private Long size;

    private String description;
    
    private Map<String, String> details;

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category == null ? null : category.trim();
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type == null ? null : type.trim();
    }

    public String getStoreType() 
    {
        return storeType;
    }

    public void setStoreType(String storeType) 
    {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    public String getLocation() 
    {
        return location;
    }

    public void setLocation(String location) 
    {
        this.location = location == null ? null : location.trim();
    }

    public Long getSize() 
    {
        return size;
    }

    public void setSize(Long size) 
    {
        this.size = size;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description == null ? null : description.trim();
    }

	public Map<String, String> getDetails() 
	{
		return details;
	}

	public void setDetails(Map<String, String> details) 
	{
		this.details = details;
	}
}
