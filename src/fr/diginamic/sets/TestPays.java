package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestPays
{

	public static void main(String[] args)
	{
		// https://fr.wikipedia.org/wiki/Liste_des_pays_par_PIB_(PPA)_par_habitant
		// https://fr.wikipedia.org/wiki/Liste_des_pays_par_population#Classement_par_population_totale_en_2022
		var pays = new HashSet<Pays>(Arrays.asList
		(
				new Pays("USA", 334_805_000, 59_495),
				new Pays("France", 65_585_000, 43_551),
				new Pays("Allemagne", 83_884_000, 50_206),
				new Pays("UK", 68_498_000, 43_620),
				new Pays("Italie", 60_263_000, 37_970),
				new Pays("Japon", 125_585_000, 42_659),
				new Pays("Chine", 1_448_471_000, 16_624),
				new Pays("Russie", 145_806_000, 24_789),
				new Pays("Inde", 1_406_632_000, 6_571)
		));
		var highestPIBPerCitizen = pays.stream().max((p1, p2) -> p1.pibHabitant - p2.pibHabitant).get();
		var highestTotalPIB = pays.stream().max((p1, p2) -> (int)(getTotalPIB(p1) - getTotalPIB(p2))).get();
		var lowestTotalPIB = pays.stream().min((p1, p2) -> (int)(getTotalPIB(p1) - getTotalPIB(p2))).get();
		
		System.out.println("Le pays avec le PIB/habitant le plus important est " + highestPIBPerCitizen.nom);
		System.out.println("Le pays avec le PIB total le plus important est " + highestTotalPIB.nom);
		
		highestTotalPIB.nom = highestTotalPIB.nom.toUpperCase();
		
		pays.remove(lowestTotalPIB);

		System.out.println();
		
		for (var p : pays)
		{
			System.out.println(p.nom);	
		}
	}

	static long getTotalPIB(Pays pays) { return pays.nombreHabitants * pays.pibHabitant; }
}
