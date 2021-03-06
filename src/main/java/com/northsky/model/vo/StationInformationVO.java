package com.northsky.model.vo;

import java.util.List;

public class StationInformationVO
{	
    private String name;

    private String category;

    private String type;

    private String title;

    private String logoMedia;

    private String description;
    
    private List<ChannelInformationVO> channels;

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

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description == null ? null : description.trim();
    }

	public List<ChannelInformationVO> getChannels() 
	{
		return channels;
	}

	public void setChannels(List<ChannelInformationVO> channels) 
	{
		this.channels = channels;
	}

	public String getLogoMedia() 
	{
		return logoMedia;
	}

	public void setLogoMedia(String logoMedia)
	{
		this.logoMedia = logoMedia;
	}
}
