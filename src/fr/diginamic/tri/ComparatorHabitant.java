package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.listes.Ville;

public class ComparatorHabitant implements Comparator<Ville>
{

	@Override
	public int compare(Ville o1, Ville o2)
	{
		return o1.nombreHabitants - o2.nombreHabitants;
	}
}
