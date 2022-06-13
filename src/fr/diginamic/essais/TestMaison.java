package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison
{
	public static void main(String[] args)
	{
		var maison = new Maison();
		maison.ajouterPiece(new Cuisine(0, 15));
		maison.ajouterPiece(new Salon(0, 30));
		maison.ajouterPiece(new Chambre(0, 10));
		maison.ajouterPiece(new Chambre(0, 10));
		maison.ajouterPiece(new SalleDeBain(1, 20));
		maison.ajouterPiece(new Wc(0, 4));
		maison.ajouterPiece(new Wc(1, 4));
		
		for (var i = 0; i < 3; i++)
		{
			maison.ajouterPiece(new Chambre(1, 15));
		}

		System.out.println("Superficie totale: " + maison.getSuperficieTotale());
		System.out.println("Superficie chambres: " + maison.getSuperficieParTypePiece(Chambre.class));
		System.out.println("Superficie étage 1: " + maison.getSuperficieParEtage(1));
		System.out.println("Nombre de chambres: " + maison.getNbPiecesParTypePiece(Chambre.class));
	}
}
