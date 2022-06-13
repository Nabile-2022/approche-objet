package fr.diginamic.banque;

public abstract class Operation
{
	private String date;
	private int montant;
	
	public Operation(String date, int montant)
	{
		this.date = date;
		this.montant = montant;
	}
	
	public String getDate() { return date; }
	
	public int getMontant() { return montant; }
	
	@Override
	public abstract String toString();
}
