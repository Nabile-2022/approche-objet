package entites;

import entites2.Personne;

public class TestPersonne
{
	public static void main(String[] args)
	{
		var p1 = new Personne("Rahmani", "Nabile", new AdressePostale(1, "rue blah", 30000, "Nîmes"));
		var p2 = new Personne("Macron", "Emmanuel", new AdressePostale(2, "rue halb", 12345, "Paris"));
	}
}
