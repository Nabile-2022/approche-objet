package fr.diginamic.banque.entites;

public class CompteTaux extends Compte
{
	private float tauxRemuneration;
	
	public CompteTaux(int numero, int solde, float tauxRemuneration)
	{
		super(numero, solde);
		
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + '\n'
				+ "Taux de rémunération: %fx".formatted(tauxRemuneration);
	}
}
