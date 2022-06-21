package fr.diginamic.recensement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recensement
{
	public List<Ville> villes;
	
	public Recensement(Path path) throws Exception
	{
		villes = readCities(path);
		// TODO: Create list of Regions/Departements, filling their cities' list.
	}
	
	static List<Ville> readCities(Path path) throws Exception
	{
		var file = path.toFile();
		var villes = new ArrayList<Ville>();
		
		if (!file.exists() || !file.isFile())
			throw new Exception("Fichier non-existant.");
		
		for (var line : Files.readAllLines(path).stream().skip(1).toList())
		{
			var ville = new Ville();
			var tokens = Arrays.asList(line.split(";")).stream().map(t -> t.trim().replaceAll(" ", "")).toList();
			
			ville.nomCommune = tokens.get(6);
			ville.nomRegion = tokens.get(1);
			ville.codeRegion = tokens.get(0);
			ville.codeDepartement = tokens.get(2);
			ville.codeCommune = tokens.get(5);
			ville.populationTotale = Integer.parseInt(tokens.get(9));
			
			villes.add(ville);
		}
		
		return villes;
	}
}
