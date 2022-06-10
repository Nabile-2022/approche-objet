package entites2;

import entites.AdressePostale;

public class Personne
{
	public String nom, prénom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prénom, AdressePostale adresse)
	{
		this.nom = nom;
		this.prénom = prénom;
		this.adresse = adresse;
	}
	
	public void showName()
	{
		System.out.println("%s %s".formatted(nom.toUpperCase(), prénom));
	}
	
	public void setPrénom(String prénom) { this.prénom = prénom; }

	public void setAdresse(AdressePostale adresse) { this.adresse = adresse; }
	
	public String getNom() { return nom; };
	
	public String getPrénom() { return prénom; }
	
	public AdressePostale getAdresse() { return adresse; }
}
