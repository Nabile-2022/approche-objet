package entites;

public class AdressePostale
{
	int numéroRue;
	String libelléRue;
	int codePostal;
	String ville;
	
	public AdressePostale(int numéroRue, String libelléRue, int codePostal, String ville)
	{
		this.numéroRue = numéroRue;
		this.libelléRue = libelléRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
