package entites2;

import entites.AdressePostale;

public class Personne
{
	public String nom, pr�nom;
	public AdressePostale adresse;
	
	public Personne(String nom, String pr�nom, AdressePostale adresse)
	{
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.adresse = adresse;
	}
}
