package fr.diginamic.testexceptions;

import fr.diginamic.listes.Ville;

public class TestReflectionUtils
{

	public static void main(String[] args) throws Exception
	{
		var ville = new Ville("Paris", 0);
		ReflectionUtils.afficherAttributs(null);
	}

}
