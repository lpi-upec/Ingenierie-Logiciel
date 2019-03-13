package me.edenskull.jaxb;

public class Tomes
{
	private Tome tome;

	public Tome getTome ()
	{
		return tome;
	}

	public void setTome (Tome tome)
	{
		this.tome = tome;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [tome = "+tome+"]";
	}
}
