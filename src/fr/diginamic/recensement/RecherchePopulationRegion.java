package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Population d�une r�gion donn�e";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Nom de la r�gion: ");
		var nom = scanner.nextLine();
		var region = recensement.villes.stream().filter(v -> v.nomRegion.equals(nom)).toList();
		var compte = region.stream().map(v -> v.populationTotale).reduce(0, Integer::sum);
		
		if (region.size() > 0)
			System.out.println("La r�gion %s a %d habitants.".formatted(nom, compte));
		else
			System.out.println("Cette r�gion n'existe pas.");
		
		System.out.println();
	}
}
