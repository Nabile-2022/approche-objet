package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque
{

	public static void main(String[] args)
	{
		var comptes = new Compte[]
		{
			new Compte(0, 1_000_000),
			new CompteTaux(1, 1_000, 1.5f)
		};
		
		for (var compte : comptes)
		{
			System.out.println(compte);
			System.out.println();
		}
	}

}
