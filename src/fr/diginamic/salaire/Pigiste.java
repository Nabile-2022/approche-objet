package fr.diginamic.salaire;

public class Pigiste extends Intervenant
{
	private int joursTravaille;
	private double remunerationJournaliere;
	
	public Pigiste(String nom, String prenom, int joursTravaille, double remunerationJournaliere)
	{
		super(nom, prenom);
		
		this.joursTravaille = joursTravaille;
		this.remunerationJournaliere = remunerationJournaliere;
	}

	@Override
	public double getSalaire()
	{
		return joursTravaille * remunerationJournaliere;
	}

	@Override
	public String getStatut()
	{
		return "Pigiste";
	}

}
