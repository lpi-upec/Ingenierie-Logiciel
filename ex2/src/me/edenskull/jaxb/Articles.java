package me.edenskull.jaxb;

public class Articles
{
	private Article article;

	public Article getArticle ()
	{
		return article;
	}

	public void setArticle (Article article)
	{
		this.article = article;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [article = "+article+"]";
	}
}
