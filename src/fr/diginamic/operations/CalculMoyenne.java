package fr.diginamic.operations;

public class CalculMoyenne
{
	private double[] values;
	
	public void ajout(double x)
	{
		if (values != null)
		{
			var newValues = new double[values.length + 1];
			System.arraycopy(values, 0, newValues, 0, values.length);
			values = newValues;
		}
		else
			values = new double[1];
		
		values[values.length - 1] = x;
	}
	
	public double calcul()
	{
		var sum = 0.0;
		
		for (var x : values)
		{
			sum += x;
		}
		
		return sum / values.length;
	}
}
