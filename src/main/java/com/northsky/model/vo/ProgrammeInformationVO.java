package com.northsky.model.vo;

public class ProgrammeInformationVO
{
    private String name;

    private String category;

    private String type;

    private String title;
    
    /**
     * 根据MediaInformation中对应的location组装
     */
    private String Media;

    /**
     * 根据MediaInformation中对应的location组装
     */
    private String snapshotMedia;

    private String description;

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

	public String getMedia() 
	{
		return Media;
	}

	public void setMedia(String media) 
	{
		Media = media;
	}

	public String getSnapshotMedia() 
	{
		return snapshotMedia;
	}

	public void setSnapshotMedia(String snapshotMedia) 
	{
		this.snapshotMedia = snapshotMedia;
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
}
