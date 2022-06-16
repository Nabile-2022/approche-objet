package fr.diginamic.formes;

public class TestObjetGeometrique
{

	public static void main(String[] args)
	{
		var objets = new ObjetGeometrique[]
		{
			new Cercle(1),
			new Rectangle(2, 1)
		};
		
		for (var objet : objets)
		{
			System.out.println("Périmètre: " + objet.perimetre());
			System.out.println("Surface: " + objet.surface());
		}
	}

}
