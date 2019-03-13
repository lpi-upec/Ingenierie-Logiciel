package me.edenskull.jaxb;

public class NormesISBN
{
	private String norme;

	public String getNorme ()
	{
		return norme;
	}

	public void setNorme (String norme)
	{
		this.norme = norme;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [norme = "+norme+"]";
	}
}
