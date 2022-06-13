package fr.diginamic.banque;

public class TestOperation
{

	public static void main(String[] args)
	{
		var operations = new Operation[]
		{
			new Credit("01/01/2010", 2000),
			new Credit("01/02/2010", 2000),
			new Debit("01/01/2011", 100),
			new Debit("01/01/2012", 900)
		};
		
		var montantGlobal = 0;
		
		for (var operation : operations)
		{
			var montant = operation.getMontant();
			
			System.out.println("Date: %s\n".formatted(operation.getDate())
					+ "Montant: %d €".formatted(montant));
			System.out.println(operation);
			System.out.println();

			if (operation instanceof Debit)
				montantGlobal -= montant;

			if (operation instanceof Credit)
				montantGlobal += montant;
		}
		
		System.out.println("Montant global: %d €".formatted(montantGlobal));
	}

}
