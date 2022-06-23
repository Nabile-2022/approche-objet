package fr.diginamic.listes;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Ville implements Comparable<Ville>
{
	public String nom;
	public int nombreHabitants;
	public Continent continent;
	
	public Ville(String nom, int nombreHabitants, Continent continent)
	{
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		this.continent = continent;
	}

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

			//return Objects.equals(nom, other.nom) && Objects.equals(nombreHabitants, other.nombreHabitants);
			return this == other || new EqualsBuilder().append(nom, other.nom).append(nombreHabitants, other.nombreHabitants).isEquals();
		}
		else
			return false;
	}
	
	@Override
	public String toString()
	{
		return "%s (en %s) - %d habitants".formatted(nom, continent, nombreHabitants);
	}
}
