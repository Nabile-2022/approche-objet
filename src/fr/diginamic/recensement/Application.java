package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application
{

	public static void main(String[] args) throws IOException
	{
		var path = Paths.get("C:\\Users\\formation\\Downloads\\OneDrive_1_17-06-2022\\recensement.csv");
		var villes = readCities(path);
		var herault = villes.stream().filter(t -> t.codeDepartement.equals("34")).toList();
		var occitanie = villes.stream().filter(v -> v.nomRegion.equals("Occitanie")).toList();
		
		// Don't get a heart attack just yet.
		System.out.println(villes.stream().filter(t -> t.nomCommune.equals("Montpellier")).findFirst().get());
		System.out.println("Population de l'Hérault: " + herault.stream().map(v -> v.populationTotale).reduce(0, Integer::sum));
		System.out.println("Plus petite ville de l'Hérault: " + herault.stream().min((v1, v2) -> v1.populationTotale - v2.populationTotale).get());
		System.out.println();

		System.out.println("Villes les plus peuplées de l'Hérault:");		
		herault.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
		System.out.println();
		
		System.out.println("Villes les moins peuplées de l'Hérault:");
		herault.stream().sorted((v1, v2) -> v1.populationTotale - v2.populationTotale).limit(10).forEach(v -> System.out.println(v));
		System.out.println();
		
		System.out.println("Population de l'Occitanie: " + occitanie.stream().map(v -> v.populationTotale).reduce(0, Integer::sum));
		System.out.println();
		
		System.out.println("Villes les plus peuplées de l'Occitanie:");
		occitanie.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
		System.out.println();
		
		System.out.println("Le département le plus peuplé de l'Occitanie est: " + occitanie.stream().collect(Collectors.groupingBy(v -> v.codeDepartement)).entrySet().stream().sorted((o1, o2) -> o2.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum) - o1.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum)).findFirst().get().getKey());
		System.out.println();
		
		System.out.println("Régions les plus peuplées de France:");
		villes.stream().collect(Collectors.groupingBy(v -> v.codeRegion)).entrySet().stream().sorted((o1, o2) -> o2.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum) - o1.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum)).limit(10).forEach(e -> System.out.println(e.getKey()));
		System.out.println();

		System.out.println("Départements les plus peuplées de France:");
		villes.stream().collect(Collectors.groupingBy(v -> v.codeDepartement)).entrySet().stream().sorted((o1, o2) -> o2.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum) - o1.getValue().stream().map(v -> v.populationTotale).reduce(0, Integer::sum)).limit(10).forEach(e -> System.out.println(e.getKey()));
		System.out.println();

		System.out.println("Villes les plus peuplées de France:");
		villes.stream().sorted((v1, v2) -> v2.populationTotale - v1.populationTotale).limit(10).forEach(v -> System.out.println(v));
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
