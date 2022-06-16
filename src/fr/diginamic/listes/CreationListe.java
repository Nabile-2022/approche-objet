package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe
{

	public static void main(String[] args)
	{
		var stuff = new ArrayList<Integer>();
		
		for (var i = 1; i <= 100; i++)
		{
			stuff.add(i);
		}
		
		System.out.println(stuff.size());
	}

}
