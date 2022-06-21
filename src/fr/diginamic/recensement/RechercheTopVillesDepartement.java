package fr.diginamic.recensement;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RechercheTopVillesDepartement extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Afficher les 10 villes les plus peuplées d’un département";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Code du département: ");
		var code = scanner.nextLine();
		
		var villes = recensement.villes;
		var departement = villes.stream().filter(t -> t.codeDepartement.equals(code)).toList();

		if (departement.size() > 0)
		{
			System.out.println("Villes les plus peuplées du %s:".formatted(code));		
			departement.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
		}
		else
			System.out.println("Ce département n'existe pas.");
		
		System.out.println();
	}
}
