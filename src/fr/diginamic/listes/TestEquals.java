package fr.diginamic.listes;

public class TestEquals
{

	public static void main(String[] args)
	{
		var v1 = new Ville("Paris", (int)2e6);
		var v2 = new Ville("Paris", (int)2e6);
		
		check(v1.equals(v2), "v1.equals(v2)");
		check(v1 == v2, "v1 == v2");
		v2.nom = "Londres";
		check(v1.equals(v2), "v1.equals(v2)");
		check(v1 == v2, "v1 == v2");
		
		v2 = v1;
		check(v1 == v2, "v1 == v2"); // Solution pour la comparaison == (compare les références mémoire).
	}

	static void check(boolean condition, String text)
	{
		System.out.println("%s = %s".formatted(text, condition));
	}
}
