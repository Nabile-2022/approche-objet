package fr.diginamic.maison;

import java.lang.reflect.Type;

public class Maison
{
	private Piece[] pieces;
	
	public void ajouterPiece(Piece piece)
	{
		if (piece == null)
			return;
		
		if (pieces != null)
		{
			var newPieces = new Piece[pieces.length + 1];
			System.arraycopy(pieces, 0, newPieces, 0, pieces.length);
			pieces = newPieces;
		}
		else
			pieces = new Piece[1];
		
		pieces[pieces.length - 1] = piece;
	}
	
	public double getSuperficieTotale()
	{
		var total = 0.0;
		
		for (var p : pieces)
		{
			total += p.getSuperficie();
		}
		
		return total;
	}
	
	public double getSuperficieParEtage(int etage)
	{
		var total = 0.0;
		
		for (var p : pieces)
		{
			if (p.getEtage() == etage)
				total += p.getSuperficie();
		}
		
		return total;
	}

	public double getSuperficieParTypePiece(Type type)
	{
		var total = 0.0;
		
		for (var p : pieces)
		{
			if (p.getClass() == type)
				total += p.getSuperficie();
		}
		
		return total;
	}

	public int getNbPiecesParTypePiece(Type type)
	{
		var total = 0;
		
		for (var p : pieces)
		{
			if (p.getClass() == type)
				total ++;
		}
		
		return total;
	}
}
