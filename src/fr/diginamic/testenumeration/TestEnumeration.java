package fr.diginamic.testenumeration;

public class TestEnumeration
{

	public static void main(String[] args)
	{
		for (var saison : Saison.values())
		{
			System.out.println(saison);
		}
		
		var nom = "ETE";
		var ete = Saison.valueOf(nom);
		System.out.println(ete.getLibelle());
		
		var libelle = "Hiver";
		var hiver = Saison.FromLibelle(libelle);
		System.out.println(hiver);
	}

}
