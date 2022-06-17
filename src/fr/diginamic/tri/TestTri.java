package fr.diginamic.tri;

import java.util.*;

import fr.diginamic.listes.Ville;

public class TestTri
{

	public static void main(String[] args)
	{
		var villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		
		villes.sort(null);
		showCities(villes);

		System.out.println("Comparé par habitants:");
		villes.sort(new ComparatorHabitant());
		showCities(villes);

		System.out.println("Comparé par noms:");
		villes.sort(new ComparatorNom());
		showCities(villes);
	}
	
	static void showCities(List<Ville> villes)
	{
		for (var ville : villes)
		{
			System.out.println(ville.nom);
		}
		
		System.out.println();
		
	}
}
