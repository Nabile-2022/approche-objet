package entites;

import entites2.Personne;

public class TestPersonne
{
	public static void main(String[] args)
	{
		var p1 = new Personne();
		p1.nom = "Rahmani";
		p1.prénom = "Nabile";
		p1.adresse = new AdressePostale();

		var p2 = new Personne();
		p2.nom = "Macron";
		p2.prénom = "Emmanuel";
		p2.adresse = new AdressePostale();
	}
}
