package fr.diginamic.maison;

public abstract class Piece
{
	private int etage;
	private double superficie;
	
	public Piece(int etage, double superficie)
	{
		this.etage = etage;
		this.superficie = superficie;
	}

	public double getSuperficie()
	{
		return superficie;
	}

	public int getEtage()
	{
		return etage;
	}
}
