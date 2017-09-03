package com.northsky.model.vo;

import java.util.List;

public class ChannelInformationVO
{
    private String name;

    private String category;

    private String type;

    private String title;

    /**
     * 根据MediaInformation的location组装
     */
    private String logoMedia;

    private String description;
    
    private List<ProgrammeInformationVO> programmes;

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

	public String getLogoMedia() 
	{
		return logoMedia;
	}

	public void setLogoMedia(String logoMedia) 
	{
		this.logoMedia = logoMedia;
	}

	public List<ProgrammeInformationVO> getProgrammes() 
	{
		return programmes;
	}

	public void setProgrammes(List<ProgrammeInformationVO> programmes) 
	{
		this.programmes = programmes;
	}
}
