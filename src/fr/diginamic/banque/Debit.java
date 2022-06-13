package fr.diginamic.banque;

public class Debit extends Operation
{
	public Debit(String date, int montant)
	{
		super(date, montant);
	}
	
	@Override
	public String getType()
	{
		return this.getClass().getSimpleName().toUpperCase();
	}
}
