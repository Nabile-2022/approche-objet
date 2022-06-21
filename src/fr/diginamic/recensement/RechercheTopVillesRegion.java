package fr.diginamic.recensement;

import java.util.Scanner;

public class RechercheTopVillesRegion extends MenuService
{
	@Override
	public String getDescription()
	{
		return "Afficher les 10 villes les plus peupl�es d�une r�gion";
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner)
	{
		System.out.print("Nom de la r�gion: ");
		var nom = scanner.nextLine();
		
		var villes = recensement.villes;
		var region = villes.stream().filter(t -> t.nomRegion.equals(nom)).toList();

		if (region.size() > 0)
		{
			System.out.println("Villes les plus peupl�es de la r�gion %s:".formatted(nom));		
			region.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
		}
		else
			System.out.println("Cette r�gion n'existe pas.");
		
		System.out.println();
	}
}
