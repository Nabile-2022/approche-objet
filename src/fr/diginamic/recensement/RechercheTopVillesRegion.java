package fr.diginamic.recensement;

import java.util.Scanner;

public class RechercheTopVillesRegion extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Afficher les 10 villes les plus peuplées d’une région";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Nom de la région: ");
		var nom = scanner.nextLine();
		
		var villes = recensement.villes;
		var region = villes.stream().filter(t -> t.nomRegion.equals(nom)).toList();

		if (region.size() > 0)
		{
			System.out.println("Villes les plus peuplées de la région %s:".formatted(nom));		
			region.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
		}
		else
			System.out.println("Cette région n'existe pas.");
		
		System.out.println();
	}
}
