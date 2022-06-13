package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature
{
	private Troll(int strength, int health)
	{
		super(strength, health);
	}

	public static Troll Create()
	{
		var random = new Random();
		var strength = random.nextInt(10, 15 + 1);
		var health = random.nextInt(20, 30 + 1);
		
		return new Troll(strength, health);
	}

	@Override
	public String getName() { return "Troll"; }
	
	@Override
	public int getXP()
	{
		return 5;
	}
}
