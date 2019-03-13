package me.edenskull.jaxb;

public class Bibliographie
{
	private Article article;

	private Livre livre;

	public Article getArticle ()
	{
		return article;
	}

	public void setArticle (Article article)
	{
		this.article = article;
	}

	public Livre getLivre ()
	{
		return livre;
	}

	public void setLivre (Livre livre)
	{
		this.livre = livre;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [article = "+article+", livre = "+livre+"]";
	}
}
