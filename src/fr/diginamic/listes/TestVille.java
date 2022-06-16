package fr.diginamic.listes;

import java.util.ArrayList;

public class TestVille
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

		var plusPeuplee = villes.stream().max((v1, v2) -> v1.nombreHabitants - v2.nombreHabitants).get();
		var moinsPeuplee = villes.stream().max((v1, v2) -> v2.nombreHabitants - v1.nombreHabitants).get();

		System.out.println("Plus peuplée: " + plusPeuplee.nom);
		System.out.println("Moins peuplée: " + moinsPeuplee.nom);
		
		villes.remove(moinsPeuplee);
		
		villes.stream().filter(v -> v.nombreHabitants > 100_000).forEach(t -> t.nom = t.nom.toUpperCase());
		
		for (var ville : villes)
		{
			System.out.println(ville.nom);
		}
	}

}
