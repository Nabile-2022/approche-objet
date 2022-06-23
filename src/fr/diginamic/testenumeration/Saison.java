package fr.diginamic.testenumeration;

public enum Saison
{
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String libelle;
	private int ordre;
	
	private Saison(String libelle, int ordre)
	{
		this.libelle = libelle;
		this.ordre = ordre;
	}
	
	public String getLibelle() { return libelle; }
	
	public static Saison FromLibelle(String libelle)
	{
		for (var s : Saison.values())
		{
			if (s.libelle.equals(libelle))
				return s;
		}
		
		return null;
	}
}
