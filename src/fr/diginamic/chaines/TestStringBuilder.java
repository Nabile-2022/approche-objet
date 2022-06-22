package fr.diginamic.chaines;

public class TestStringBuilder
{
	public static void main(String[] args)
	{
		//var builder = new StringBuilder();
		var text = "";
		var startTime = System.currentTimeMillis();
		
		for (var i = 1; i <= 100_000; i++)
		{
			//builder.append(i);
			text += i;
		}

		var endTime = System.currentTimeMillis();
		
		System.out.println("Temps: " + (endTime - startTime) + " ms");
	}
}
