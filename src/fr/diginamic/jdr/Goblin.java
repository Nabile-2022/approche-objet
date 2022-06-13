package fr.diginamic.jdr;

import java.util.Random;

public class Goblin extends Creature
{

	private Goblin(int strength, int health)
	{
		super(strength, health);
	}

	public static Goblin Create()
	{
		var random = new Random();
		var strength = random.nextInt(5, 10 + 1);
		var health = random.nextInt(10, 15 + 1);
		
		return new Goblin(strength, health);
	}

	@Override
	public String getName() { return "Gobelin"; }
	
	@Override
	public int getXP()
	{
		return 2;
	}
}
