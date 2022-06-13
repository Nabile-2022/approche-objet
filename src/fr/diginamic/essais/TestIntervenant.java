package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant
{

	public static void main(String[] args)
	{
		var intervenants = new Intervenant[]
		{
			new Salarie("Aaa", "Aaa", 1500),
			new Pigiste("Bbb", "Bbb", 7, 100)
		};
		
		for (var i : intervenants)
		{
			System.out.println("Salaire: " + i.getSalaire());
			i.afficherDonnees();
			System.out.println();
		}
	}

}
