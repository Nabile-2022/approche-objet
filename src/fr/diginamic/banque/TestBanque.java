package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque
{

	public static void main(String[] args)
	{
		var compte = new Compte(0, 1_000_000);
		
		System.out.println(compte);
	}

}
