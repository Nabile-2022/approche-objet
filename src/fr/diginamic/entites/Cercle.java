package fr.diginamic.entites;

public class Cercle
{
	private double rayon;

	public Cercle(double rayon)
	{
		this.rayon = rayon;
	}

	public double getPerimetre() { return 2 * Math.PI * rayon; }
	
	public double getSurface() { return Math.PI * (rayon * rayon); }
}
