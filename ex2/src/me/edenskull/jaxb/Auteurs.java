package me.edenskull.jaxb;

public class Auteurs
{
	private String auteur;

	public String getAuteur ()
	{
		return auteur;
	}

	public void setAuteur (String auteur)
	{
		this.auteur = auteur;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [auteur = "+auteur+"]";
	}
}
