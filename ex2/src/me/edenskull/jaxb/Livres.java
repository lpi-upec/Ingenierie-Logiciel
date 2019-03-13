package me.edenskull.jaxb;

public class Livres
{
	private Livre livre;

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
		return "ClassPojo [livre = "+livre+"]";
	}
}
