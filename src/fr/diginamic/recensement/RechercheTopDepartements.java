package fr.diginamic.recensement;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RechercheTopDepartements extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Afficher les 10 départements les plus peuplés";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{		
		var villes = recensement.villes;
		System.out.println("Départements les plus peuplés de France:");
		villes.stream().collect(Collectors.groupingBy(v -> v.codeDepartement)).entrySet().stream().sorted((o1, o2) -> o2.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum) - o1.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum)).limit(10).forEach(e -> System.out.println(e.getKey()));
		System.out.println();
	}
}
