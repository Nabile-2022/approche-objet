package fr.diginamic.listes;

import java.util.*;

public class FusionListe
{

	public static void main(String args[])
	{
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		var liste3 = new ArrayList<String>();
		copy(liste1, liste3);
		copy(liste2, liste3);
		
		for (var item : liste3)
		{
			System.out.println(item);
		}
	}
	
	static <T> void copy(List<T> a, List<T> b)
	{
		for (var item : a)
		{
			b.add(item);
		}
	}
}
