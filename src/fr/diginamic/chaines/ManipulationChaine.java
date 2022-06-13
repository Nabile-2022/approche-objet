package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine
{
	public static void main(String[] args)
	{
		String chaine = "Durand;Marcel;2 523.5";
		var nom = chaine.substring(0, chaine.indexOf(';'));
		
		System.out.println("Premier caractère: " + chaine.charAt(0));
		System.out.println("Length: " + chaine.length());
		System.out.println("IndexOf ';': " + chaine.indexOf(';'));
		System.out.println("Nom: " + nom);
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());

		var split = chaine.split(";");
		
		for (var x : split)
		{
			System.out.println(x);
		}
		
		var salaire = Double.parseDouble(split[2].replace(" ", ""));
		var salarie = new Salarie(split[0], split[1], salaire);
		
		System.out.println(salarie);
	}
}
