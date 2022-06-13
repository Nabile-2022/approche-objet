package fr.diginamic.banque;

public class Credit extends Operation
{
	public Credit(String date, int montant)
	{
		super(date, montant);
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName().toUpperCase();
	}
}
