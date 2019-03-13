package me.edenskull.jaxb;

public class Avis_personnel
{
	private String mandatory;

	private String content;

	public String getMandatory ()
	{
		return mandatory;
	}

	public void setMandatory (String mandatory)
	{
		this.mandatory = mandatory;
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
		return "ClassPojo [mandatory = "+mandatory+", content = "+content+"]";
	}
}
