package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetDouble
{

	public static void main(String[] args)
	{
		var xs = new HashSet<Double>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		var largest = xs.iterator().next();
		var smallest = largest;
		
		for (var x : xs)
		{
			System.out.println(x);
			
			if (x > largest)
				largest = x;
			
			if (x < smallest)
				smallest = x;
		}
		
		xs.remove(smallest);

		System.out.println();
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		System.out.println();
		
		for (var x : xs)
		{
			System.out.println(x);
		}
	}

}
