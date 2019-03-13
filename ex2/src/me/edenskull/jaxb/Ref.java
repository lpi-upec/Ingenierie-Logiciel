package me.edenskull.jaxb;

public class Ref
{
	private String journal;

	private String num_journal;

	private String page;

	private String annee;

	private String content;

	public String getJournal ()
	{
		return journal;
	}

	public void setJournal (String journal)
	{
		this.journal = journal;
	}

	public String getNum_journal ()
	{
		return num_journal;
	}

	public void setNum_journal (String num_journal)
	{
		this.num_journal = num_journal;
	}

	public String getPage ()
	{
		return page;
	}

	public void setPage (String page)
	{
		this.page = page;
	}

	public String getAnnee ()
	{
		return annee;
	}

	public void setAnnee (String annee)
	{
		this.annee = annee;
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
		return "ClassPojo [journal = "+journal+", num_journal = "+num_journal+", page = "+page+", annee = "+annee+", content = "+content+"]";
	}
}
