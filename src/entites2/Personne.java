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
	
	public void showName()
	{
		System.out.println("%s %s".formatted(nom.toUpperCase(), pr�nom));
	}
	
	public void setPr�nom(String pr�nom) { this.pr�nom = pr�nom; }

	public void setAdresse(AdressePostale adresse) { this.adresse = adresse; }
	
	public String getNom() { return nom; };
	
	public String getPr�nom() { return pr�nom; }
	
	public AdressePostale getAdresse() { return adresse; }
}
