package me.edenskull.jaxb;

public class Tome
{
	private String page;

	private String content;

	public String getPage ()
	{
		return page;
	}

	public void setPage (String page)
	{
		this.page = page;
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
		return "ClassPojo [page = "+page+", content = "+content+"]";
	}
}
