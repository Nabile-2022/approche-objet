package fr.diginamic.recensement;

import java.nio.file.Paths;
import java.util.Scanner;

public class Application
{
	private static MenuService[] services = new MenuService[]
	{
		new RecherchePopulationVille(),
		new RecherchePopulationDepartement(),
		new RecherchePopulationRegion(),
		new RechercheTopRegions(),
		new RechercheTopDepartements(),
		new RechercheTopVillesDepartement(),
		new RechercheTopVillesRegion(),
		new RechercheTopVilles()
	};

	public static void main(String[] args) throws Exception
	{
		var path = Paths.get("C:\\Users\\formation\\Downloads\\OneDrive_1_17-06-2022\\recensement.csv");
		var recensement = new Recensement(path);
		var scanner = new Scanner(System.in);
		
		while (true)
		{
			showMenu();
			var choix = readCommand(scanner) - 1;
			
			if (choix < 0 || choix > services.length)
				continue;
			
			if (choix == services.length)
				break;
			
			var menu = services[choix];
			menu.traiter(recensement, scanner);
		}
	}

	private static void showMenu()
	{
		for (var i = 0; i < services.length; i++)
		{
			System.out.println("%d: %s".formatted(i + 1, services[i].getDescription()));
		}
		
		System.out.println("%d: Quitter".formatted(services.length + 1));
	}

	private static int readCommand(Scanner scanner)
	{
		var command = 0;
		try
		{
			command = Integer.parseInt(scanner.nextLine());
		}
		catch (Exception e)
		{
		}
		
		System.out.println();
		return command;
	}
}
