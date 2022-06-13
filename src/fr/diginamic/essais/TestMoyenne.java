package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne
{
	public static void main(String[] args)
	{
		var calcul = new CalculMoyenne();
		calcul.ajout(10);
		calcul.ajout(10);
		
		check(calcul.calcul() == 10);

		calcul.ajout(100);
		calcul.ajout(100);
		
		check(calcul.calcul() == 55);
	}

	private static void check(boolean success) { System.out.println(success); }
}
