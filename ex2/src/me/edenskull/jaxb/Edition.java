package me.edenskull.jaxb;

public class Edition
{
	private String name;

	private String adresse;

	private String impression;

	private String content;

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public String getAdresse ()
	{
		return adresse;
	}

	public void setAdresse (String adresse)
	{
		this.adresse = adresse;
	}

	public String getImpression ()
	{
		return impression;
	}

	public void setImpression (String impression)
	{
		this.impression = impression;
	}

	public String getContent ()
	{
		return content;
	}

	public void setContent (String content)
	{
		this.content = content;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [name = "+name+", adresse = "+adresse+", impression = "+impression+", content = "+content+"]";
	}
}
