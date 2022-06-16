package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString
{

	public static void main(String[] args)
	{
		var villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		var longueVille = villes.get(0);
		
		for (var ville : villes)
		{
			if (ville.length() > longueVille.length())
				longueVille = ville;
		}
		
		System.out.println("La ville la plus longue est " + longueVille);

		for (var i = 0; i < villes.size(); i++)
		{
			var ville = villes.get(i).toUpperCase();
			
			villes.set(i, ville);
			
			if (ville.charAt(0) == 'N')
				villes.remove(i--);
		}
		
		for (var ville : villes)
		{
			System.out.println(ville);
		}
	}

}
