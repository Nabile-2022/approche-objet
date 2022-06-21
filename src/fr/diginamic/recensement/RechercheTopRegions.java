package fr.diginamic.recensement;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RechercheTopRegions extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Afficher les 10 régions les plus peuplées";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{		
		var villes = recensement.villes;
		System.out.println("Régions les plus peuplées de France:");
		villes.stream().collect(Collectors.groupingBy(v -> v.nomRegion)).entrySet().stream().sorted((o1, o2) -> o2.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum) - o1.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum)).limit(10).forEach(e -> System.out.println(e.getKey()));
		System.out.println();
	}
}
