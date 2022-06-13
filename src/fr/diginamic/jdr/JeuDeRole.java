package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

public class JeuDeRole
{
	static boolean running;
	static Character character;
	static Random random = new Random();
	
	public static void main(String[] args)
	{
		running = true;
		
		while (running)
		{
			showMenu();
			
			switch (readCommand())
			{
			case 1:
				createCharacter();
				break;
			case 2:
				fight();
				break;
			case 3:
				showScore();
				break;
			case 4:
				running = false;
				
				if (character != null && isAlive(character))
					System.out.println("Vous repartez victorieux dans le monde tri-dimensionnel.");
				else
					System.out.println("Vous êtes condamné à errer dans le monde des morts.");
				break;
			}
			
			System.out.println();
		}
	}
	
	private static int getAttackLevel(Creature creature)
	{
		return creature.getStength() + (random.nextInt(10) + 1);
	}
	
	private static Creature findEnemy()
	{
		// Yes. Really.
		var creatures = new Creature[]
		{
			Wolf.Create(),
			Goblin.Create(),
			Troll.Create()
		};
		
		return creatures[random.nextInt(creatures.length)];
	}

	private static boolean isAlive(Creature creature) { return creature.getHealth() > 0; }
	
	private static void fight()
	{
		if (character == null)
		{
			System.out.println("Vous devez d'abord créer un personnage.");
			return;
		}
		
		if (!isAlive(character))
		{
			System.out.println("Vous ne le savez pas encore, mais vous êtes déjà mort.");
			showScore();
			System.out.println("Trouvez une nouvelle victime pour poursuivre l'aventure.");
			return;
		}
		
		var enemy = findEnemy();
		var enemyName = enemy.getName();
		
		System.out.println("Vous vous trouvez nez-à-nez face à un %s !".formatted(enemyName));
		
		do
		{
			var characterAttack = getAttackLevel(character);
			var enemyAttack = getAttackLevel(enemy);
			var damage = characterAttack - enemyAttack;

			switch ((int)Math.signum(damage))
			{
			case 1: // Player wins.
				enemy.hurt(damage);
				System.out.println("Vous tranchez violemment le %s pour %d points de dommages.".formatted(enemyName, damage));
				break;
			case 0: // Stalemate.
				System.out.println("Vos forces se heurtent, créant une puissante onde de choc perturbant les sens.");
				break;
			case -1: // Enemy wins.
				damage = -damage;
				character.hurt(damage);
				System.out.println("Le %s vous fracasse contre le sol pour %d points de dommages.".formatted(enemyName, damage));
				break;
			}
		}
		while (isAlive(character) && isAlive(enemy));

		if (!isAlive(enemy))
		{
			System.out.println("Le %s s'effondre lourdement, relâchant son dernier soupir.".formatted(enemyName));
			
			var xp = enemy.getXP();
			character.gainXP(xp);
			System.out.println("Vous gagnez %d points d'expérience !".formatted(xp));
		}
		
		if (!isAlive(character))
		{
			System.out.println("Vous succombez à vos blessures.");
			showScore();
		}
	}

	private static void showScore()
	{
		if (character == null)
		{
			System.out.println("Vous devez d'abord créer un personnage.");
			return;
		}

		var score = character.getScore();
		var scoreAdjective = "lamentable";
		
		if (score >= 100)
			scoreAdjective = "épique";
		else if (score >= 30)
			scoreAdjective = "potable";
		
		System.out.println("Vous avez un score %s de %d XP pour vos meurtres sanglants.".formatted(scoreAdjective, score));
	}

	private static void createCharacter()
	{
		character = Character.Create();
		System.out.println("Nouveau personnage créé:");
		System.out.println("\tSanté: %d".formatted(character.getHealth()));
		System.out.println("\tForce: %d".formatted(character.getStength()));
	}

	private static void showMenu()
	{
		System.out.println("1: Créer un personnage");
		System.out.println("2: Combattre une créature");
		System.out.println("3: Afficher le score");
		System.out.println("4: Quitter");
	}

	private static int readCommand()
	{
		var command = 0;
		try
		{
			var reader = new Scanner(System.in);
			command = reader.nextInt();
		}
		catch (Exception e)
		{
		}
		
		System.out.println();
		return command;
	}
}
