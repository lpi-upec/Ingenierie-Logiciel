package me.edenskull.jaxb;

public class Livre
{
	private Avis_personnel avis_personnel;

	private String titre;

	private Tomes tomes;

	private String normesISBN;

	private Edition edition;

	private String auteur;

	public Avis_personnel getAvis_personnel ()
	{
		return avis_personnel;
	}

	public void setAvis_personnel (Avis_personnel avis_personnel)
	{
		this.avis_personnel = avis_personnel;
	}

	public String getTitre ()
	{
		return titre;
	}

	public void setTitre (String titre)
	{
		this.titre = titre;
	}

	public Tomes getTomes ()
	{
		return tomes;
	}

	public void setTomes (Tomes tomes)
	{
		this.tomes = tomes;
	}

	public String getNormesISBN ()
	{
		return normesISBN;
	}

	public void setNormesISBN (String normesISBN)
	{
		this.normesISBN = normesISBN;
	}

	public Edition getEdition ()
	{
		return edition;
	}

	public void setEdition (Edition edition)
	{
		this.edition = edition;
	}

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
		return "ClassPojo [avis_personnel = "+avis_personnel+", titre = "+titre+", tomes = "+tomes+", normesISBN = "+normesISBN+", edition = "+edition+", auteur = "+auteur+"]";
	}
}
