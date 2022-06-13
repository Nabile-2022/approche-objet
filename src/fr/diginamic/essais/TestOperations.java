package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations
{

	public static void main(String[] args)
	{
		check(Operations.calcul(10, 10, '+') == 20);
		check(Operations.calcul(10, 10, '-') == 0);
		check(Operations.calcul(10, 10, '*') == 100);
		check(Operations.calcul(10, 10, '/') == 1);
	}

	private static void check(boolean success) { System.out.println(success); }
}
