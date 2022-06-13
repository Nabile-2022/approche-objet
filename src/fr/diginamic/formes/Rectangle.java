package fr.diginamic.formes;

public class Rectangle extends Forme
{
	private double longueur, largeur;
	
	public Rectangle(double longueur, double largeur)
	{
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface()
	{
		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre()
	{
		return 2 * (longueur + largeur);
	}

}
