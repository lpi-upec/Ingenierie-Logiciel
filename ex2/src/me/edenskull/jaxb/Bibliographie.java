package me.edenskull.jaxb;

public class Bibliographie
{
	private Livres livres;

	private Articles articles;

	public Livres getLivres ()
	{
		return livres;
	}

	public void setLivres (Livres livres)
	{
		this.livres = livres;
	}

	public Articles getArticles ()
	{
		return articles;
	}

	public void setArticles (Articles articles)
	{
		this.articles = articles;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [livres = "+livres+", articles = "+articles+"]";
	}
}
