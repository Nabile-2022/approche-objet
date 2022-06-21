package fr.diginamic.recensement;

import java.util.Scanner;

public class RechercheTopVilles extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Afficher les 10 villes les plus peuplées de France";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		var villes = recensement.villes;
		
		System.out.println("Villes les plus peuplées de France:");
		villes.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
		System.out.println();
	}
}
