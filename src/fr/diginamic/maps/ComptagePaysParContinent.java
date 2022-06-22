package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ComptagePaysParContinent
{
	public static void main(String[] args)
	{
		var pays = new ArrayList<Pays>(Arrays.asList
		(
			new Pays("France", "Europe", (int)65e6),
			new Pays("Allemagne", "Europe", (int)80e6),
			new Pays("Belgique", "Europe", (int)10e6),
			new Pays("Russie", "Europe", (int)150e6),
			new Pays("Chine", "Asie", (int)1.4e9),
			new Pays("Indonésie", "Asie", (int)220e6),
			new Pays("Australie", "Océanie", (int)20e6)
		));
		var map = new HashMap<String, Integer>();
		
		for (var p : pays)
		{
			var key = p.continent;
			var count = map.getOrDefault(key, 0);
			count++;
			map.put(key, count);
		}
		
		for (var pair : map.entrySet())
		{
			System.out.println("%s: %d pays".formatted(pair.getKey(), pair.getValue()));
		}
	}
}
