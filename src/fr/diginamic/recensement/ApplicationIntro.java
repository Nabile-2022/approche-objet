package fr.diginamic.recensement;

import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ApplicationIntro
{

	public static void main(String[] args) throws Exception
	{
		var path = Paths.get("C:\\Users\\formation\\Downloads\\OneDrive_1_17-06-2022\\recensement.csv");
		var villes = new Recensement(path).villes;
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
}
