package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString
{

	public static void main(String[] args)
	{
		var xs = new HashSet<String>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		var longest = xs.stream().max((a, b) -> a.length() - b.length()).get();
		
		xs.remove(longest);
		
		for (var x : xs)
		{
			System.out.println(x);
		}
	}

}
