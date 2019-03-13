package me.edenskull.jaxb;

public class Edition
{
	private String adresse;

	private String editeur;

	public String getAdresse ()
	{
		return adresse;
	}

	public void setAdresse (String adresse)
	{
		this.adresse = adresse;
	}

	public String getEditeur ()
	{
		return editeur;
	}

	public void setEditeur (String editeur)
	{
		this.editeur = editeur;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [adresse = "+adresse+", editeur = "+editeur+"]";
	}
}
