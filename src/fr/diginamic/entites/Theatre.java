package fr.diginamic.entites;

public class Theatre
{
	private String nom;
	private int capaciteMax, clientsInscrits;
	private double recetteTotale;
	
	public Theatre(String nom, int capaciteMax)
	{
		this.nom = nom;
		this.capaciteMax = capaciteMax;
	}

	public void inscrire(int nombreClients, double prixPlace)
	{
		if (clientsInscrits + nombreClients > capaciteMax)
		{
			System.out.println("Limite de places atteinte.");
			return;
		}
		
		clientsInscrits += nombreClients;
		recetteTotale += nombreClients * prixPlace;
	}
	
	public int getClientsInscrits() { return clientsInscrits; }
	
	public double getRecetteTotale() { return recetteTotale; }
}
