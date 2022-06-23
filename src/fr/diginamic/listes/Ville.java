package fr.diginamic.listes;

import org.apache.commons.lang3.builder.EqualsBuilder;

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

			//return nom == other.nom && nombreHabitants == other.nombreHabitants;
			return this == other || new EqualsBuilder().append(nom, other.nom).append(nombreHabitants, other.nombreHabitants).isEquals();
		}
		else
			return false;
	}
}
