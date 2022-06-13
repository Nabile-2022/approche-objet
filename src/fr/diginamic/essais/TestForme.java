package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme
{
	public static void main(String[] args)
	{
		var formes = new Forme[]
		{
				new Cercle(10),
				new Rectangle(20, 10),
				new Carre(10)
		};
		
		for (var forme : formes)
		{
			AffichageForme.afficher(forme);
			System.out.println();
		}
	}

}
