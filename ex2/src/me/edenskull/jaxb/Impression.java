package me.edenskull.jaxb;

public class Impression
{
	private String imprimeur;

	private String adresse;

	public String getImprimeur ()
	{
		return imprimeur;
	}

	public void setImprimeur (String imprimeur)
	{
		this.imprimeur = imprimeur;
	}

	public String getAdresse ()
	{
		return adresse;
	}

	public void setAdresse (String adresse)
	{
		this.adresse = adresse;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [imprimeur = "+imprimeur+", adresse = "+adresse+"]";
	}
}
