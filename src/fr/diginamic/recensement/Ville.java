package fr.diginamic.recensement;

public class Ville
{
	public String nomCommune, nomRegion, codeDepartement, codeRegion, codeCommune;
	public int populationTotale;
	
	@Override
	public String toString()
	{
		return "%s (%s), département %s, région %s (%s) - %d habitants"
			.formatted(nomCommune, codeCommune, codeDepartement, nomRegion, codeRegion, populationTotale);
	}
}
