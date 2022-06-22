package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap
{
	public static void main(String[] args)
	{
		var map = new HashMap<String, Integer>();
		map.put("Paul", 1750);
		map.put("Hicham", 1825);
		map.put("Yu", 2250);
		map.put("Ingrid", 2015);
		map.put("Chantal", 2418);
		
		System.out.println("Taille: " + map.size());
	}
}
