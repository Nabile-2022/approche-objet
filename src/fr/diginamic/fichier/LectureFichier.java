package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

public class LectureFichier
{

	public static void main(String[] args) throws IOException
	{
		var path = Paths.get("C:\\Users\\formation\\Downloads\\OneDrive_1_17-06-2022\\recensement.csv");
		var villes = readCities(path);
		var outPath = Paths.get(path.getParent().toString(), path.getFileName() + ".filtre.csv");
		
		writeCities(villes.stream().filter(v -> v.populationTotale > 25_000), outPath);
	}
	
	private static void writeCities(Stream<Ville> cities, Path path) throws IOException
	{
		var file = path.toFile();
		
		if (file.exists())
			file.delete();
		
		Files.writeString(path, "Nom de la commune; Nom du département; Code du département; Population totale;\n", StandardOpenOption.CREATE);
		
		for (var city : cities.toList())
		{
			var line = "%s;%s;%s;%d\n".formatted(city.nom, city.nomRegion, city.codeDepartement, city.populationTotale);
			Files.writeString(path, line, StandardOpenOption.APPEND);
		}
	}

	static List<Ville> readCities(Path path) throws IOException
	{
		var file = path.toFile();
		var villes = new ArrayList<Ville>();
		
		if (!file.exists() || !file.isFile())
		{
			System.err.println("Fichier non-existant.");
			System.exit(1);
		}
		
		for (var line : Files.readAllLines(path).stream().skip(1).toList())
		{
			var ville = new Ville();
			var tokens = Arrays.asList(line.split(";")).stream().map(t -> t.trim().replaceAll(" ", "")).toList();
			
			ville.nom = tokens.get(6);
			ville.nomRegion = tokens.get(1);
			ville.codeDepartement = tokens.get(2);
			ville.populationTotale = Integer.parseInt(tokens.get(9));
			
			villes.add(ville);
		}
		
		return villes;
	}

}
