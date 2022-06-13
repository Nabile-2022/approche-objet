package fr.diginamic.formes;

public class Cercle extends Forme
{
	private double rayon;
	
	public Cercle(double rayon)
	{
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface()
	{
		return Math.PI * (rayon * rayon);
	}

	@Override
	public double calculerPerimetre()
	{
		return 2 * Math.PI * rayon;
	}

}
