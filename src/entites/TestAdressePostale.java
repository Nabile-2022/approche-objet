package entites;

public class TestAdressePostale
{

	public static void main(String[] args)
	{
		var a1 = new AdressePostale();
		a1.num�roRue = 1;
		a1.libell�Rue = "rue Jean Moulin";
		a1.codePostal = 30000;
		a1.ville = "N�mes";
		
		var a2 = new AdressePostale();
		a2.num�roRue = 69;
		a2.libell�Rue = "rue Jean Michel";
		a2.codePostal = 36000;
		a2.ville = "Paris";
	}

}
