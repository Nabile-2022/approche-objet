package fr.diginamic.listes;

import java.util.*;

public class TestListeInt
{

	public static void main(String[] args)
	{
		var stuff = new ArrayList<Integer>();

		for (var x : new int[] { -1, 5, 7, 3, -2, 4, 8, 5 })
		{
			stuff.add(x);
		}
		
		for (var x : stuff)
		{
			System.out.println(x);
		}
		
		System.out.println("Size: " + stuff.size());
		
		var largest = stuff.get(0);
		var smallest = largest;
		
		for (var i = 0; i < stuff.size(); i++)
		{
			var x = stuff.get(i);
			
			if (x > largest)
				largest = x;
			
			if (x < smallest)
				smallest = x;
			
			if (x < 0)
				stuff.set(i, -x);
		}
		
		System.out.println("Largest: " + largest);
		
		stuff.remove(smallest);
		System.out.println("Smallest: " + smallest);
		
		System.out.println("Liste:");
		
		for (var x : stuff)
		{
			System.out.println(x);
		}
	}

}
