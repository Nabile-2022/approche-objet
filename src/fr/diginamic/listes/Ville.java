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
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Ville)
		{
			Ville other = (Ville) obj;
			
			return nom == other.nom && nombreHabitants == other.nombreHabitants;
		}
		else
			return false;
	}
}
