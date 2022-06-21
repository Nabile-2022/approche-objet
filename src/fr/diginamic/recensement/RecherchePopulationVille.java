package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService
{

	@Override
	public String getDescription()
	{
		return "Population d’une ville donnée";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Nom de la ville: ");
		var nom = scanner.nextLine();
		var ville = recensement.villes.stream().filter(v -> v.nomCommune.equals(nom)).findFirst();

		if (ville.isPresent())
			System.out.println(ville.get());
		else
			System.out.println("Cette ville n'existe pas.");
		
		System.out.println();
	}

}
