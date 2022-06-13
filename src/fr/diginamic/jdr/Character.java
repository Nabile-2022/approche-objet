package fr.diginamic.jdr;

import java.util.Random;

/**
 * User-controlled character.
 */
public class Character extends Creature
{
	private int score;

	private Character(int strength, int health)
	{
		super(strength, health);
	}
	
	public static Character Create()
	{
		var random = new Random();
		var strength = random.nextInt(12, 18 + 1);
		var health = random.nextInt(20, 50 + 1);
		
		return new Character(strength, health);
	}

	@Override
	public String getName() { return "Personnage"; }
	
	@Override
	public int getXP() { return 0; }
	
	/**
	 * Adds 'xp' experience points to the score.
	 */
	public void gainXP(int xp) { score += xp; }

	public int getScore() { return score; }
}
