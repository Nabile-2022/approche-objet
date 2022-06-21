package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Population d’une région donnée";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Nom de la région: ");
		var nom = scanner.nextLine();
		var region = recensement.villes.stream().filter(v -> v.nomRegion.equals(nom)).toList();
		var compte = region.stream().map(v -> v.populationTotale).reduce(0, Integer::sum);
		
		if (region.size() > 0)
			System.out.println("La région %s a %d habitants.".formatted(nom, compte));
		else
			System.out.println("Cette région n'existe pas.");
		
		System.out.println();
	}
}
