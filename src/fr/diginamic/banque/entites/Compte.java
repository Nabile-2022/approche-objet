package fr.diginamic.banque.entites;

public class Compte
{
	private int numero, solde;
	
	public Compte(int numero, int solde)
	{
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString()
	{
		return "Numéro: %d\n".formatted(numero)
				+ "Solde: %d €".formatted(solde);
	}
}
