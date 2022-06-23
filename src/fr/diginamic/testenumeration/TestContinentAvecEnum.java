package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Arrays;

import fr.diginamic.listes.Continent;
import fr.diginamic.listes.Ville;

public class TestContinentAvecEnum
{

	public static void main(String[] args)
	{
		var villes = new ArrayList<Ville>(Arrays.asList
		(
				new Ville("New York", 1, Continent.AMERIQUE),
				new Ville("Paris", 1, Continent.EUROPE),
				new Ville("Pékin", 1, Continent.ASIE),
				new Ville("Moscou", 1, Continent.EUROPE),
				new Ville("Berlin", 1, Continent.EUROPE),
				new Ville("Sydney", 1, Continent.OCEANIE),
				new Ville("Sao Paulo", 1, Continent.AMERIQUE),
				new Ville("Dakar", 1, Continent.AFRIQUE)
		));
		
		for (var ville : villes)
		{
			System.out.println(ville);
		}
	}

}
