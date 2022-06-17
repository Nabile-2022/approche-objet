package fr.diginamic.listes;

public class Ville implements Comparable<Ville>
{
	public String nom;
	public int nombreHabitants;
	
	public Ville(String nom, int nombreHabitants)
	{
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
	}

	@Override
	public int compareTo(Ville o)
	{
		return nombreHabitants - o.nombreHabitants;
	}
}
