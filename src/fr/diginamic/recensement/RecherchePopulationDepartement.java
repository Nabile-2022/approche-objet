package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService
{

	@Override
	public String getDescription()
	{
		return "Population d�un d�partement donn�";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Code du d�partement: ");
		var code = scanner.nextLine();
		var departement = recensement.villes.stream().filter(v -> v.codeDepartement.equals(code)).toList();
		var compte = departement.stream().map(v -> v.populationTotale).reduce(0, Integer::sum);
		
		if (departement.stream().count() > 0)
			System.out.println("Le %s a %d habitants.".formatted(code, compte));
		else
			System.out.println("Ce d�partement n'existe pas.");
		
		System.out.println();
	}

}
