package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle
{

	public static void main(String[] args)
	{
		var cercles = new Cercle[]
		{
				new Cercle(1),
				new Cercle(4),
				CercleFactory.Create(420)
		};
		
		for (var cercle : cercles)
		{
			System.out.println("Périmètre: " + cercle.getPerimetre());
			System.out.println("Surface: " + cercle.getSurface());
			System.out.println();
		}
	}

}
