package me.edenskull.jaxb;

public class Avis_personnel
{
	private String use;

	private String content;

	public String getUse ()
	{
		return use;
	}

	public void setUse (String use)
	{
		this.use = use;
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
		return "ClassPojo [use = "+use+", content = "+content+"]";
	}
}
