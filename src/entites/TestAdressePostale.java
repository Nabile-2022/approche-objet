package entites;

public class TestAdressePostale
{

	public static void main(String[] args)
	{
		var a1 = new AdressePostale();
		a1.numéroRue = 1;
		a1.libelléRue = "rue Jean Moulin";
		a1.codePostal = 30000;
		a1.ville = "Nîmes";
		
		var a2 = new AdressePostale();
		a2.numéroRue = 69;
		a2.libelléRue = "rue Jean Michel";
		a2.codePostal = 36000;
		a2.ville = "Paris";
	}

}
