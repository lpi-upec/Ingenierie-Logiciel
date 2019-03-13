package me.edenskull.jaxb;

public class Article
{
	private Ref ref;

	private Avis_personnel avis_personnel;

	private String titre;

	private String auteur;

	public Ref getRef ()
	{
		return ref;
	}

	public void setRef (Ref ref)
	{
		this.ref = ref;
	}

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
		return "ClassPojo [ref = "+ref+", avis_personnel = "+avis_personnel+", titre = "+titre+", auteur = "+auteur+"]";
	}
}
