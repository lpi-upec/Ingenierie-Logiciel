package me.edenskull.jaxb;

public class Article
{
	private Ref ref;

	private Avis_personnel avis_personnel;

	private Auteurs auteurs;

	private String titre;

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

	@Override
	public String toString()
	{
		return "ClassPojo [ref = "+ref+", avis_personnel = "+avis_personnel+", auteurs = "+auteurs+", titre = "+titre+"]";
	}
}
