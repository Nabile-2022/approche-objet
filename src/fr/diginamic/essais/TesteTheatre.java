package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TesteTheatre
{

	public static void main(String[] args)
	{
		var theatre = new Theatre("Un quelquonque théatre", 100);
		
		theatre.inscrire(50, 20);
		theatre.inscrire(40, 40);
		theatre.inscrire(11, 40);

		System.out.println("Clients inscrits: %d".formatted(theatre.getClientsInscrits()));
		System.out.println("Recette totale: %f €".formatted(theatre.getRecetteTotale()));
	}

}
