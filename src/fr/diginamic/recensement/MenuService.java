package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService
{
	public abstract String getDescription();
	
	public abstract void traiter(Recensement recensement, Scanner scanner);
}
