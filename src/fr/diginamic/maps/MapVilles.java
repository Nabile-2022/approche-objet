package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

import fr.diginamic.listes.Ville;

public class MapVilles
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
		
		var map = new HashMap<String, Ville>();
		
		for (var ville : villes)
		{
			map.put(ville.nom, ville);
		}

		map.remove(map.values().stream().min((v1, v2) -> v1.nombreHabitants - v2.nombreHabitants).get().nom);
		map.keySet().stream().forEach(nom -> System.out.println(nom));
	}

}
