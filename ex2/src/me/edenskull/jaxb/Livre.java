package me.edenskull.jaxb;

public class Livre
{
	private Avis_personnel avis_personnel;

	private Auteurs auteurs;

	private String titre;

	private Tomes tomes;

	private NormesISBN normesISBN;

	private Edition edition;

	private Impression impression;

	public Avis_personnel getAvis_personnel ()
	{
		return avis_personnel;
	}

	public void setAvis_personnel (Avis_personnel avis_personnel)
	{
		this.avis_personnel = avis_personnel;
	}

	public Auteurs getAuteurs ()
	{
		return auteurs;
	}

	public void setAuteurs (Auteurs auteurs)
	{
		this.auteurs = auteurs;
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

	public NormesISBN getNormesISBN ()
	{
		return normesISBN;
	}

	public void setNormesISBN (NormesISBN normesISBN)
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

	public Impression getImpression ()
	{
		return impression;
	}

	public void setImpression (Impression impression)
	{
		this.impression = impression;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [avis_personnel = "+avis_personnel+", auteurs = "+auteurs+", titre = "+titre+", tomes = "+tomes+", normesISBN = "+normesISBN+", edition = "+edition+", impression = "+impression+"]";
	}
}
