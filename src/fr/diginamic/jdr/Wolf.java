package fr.diginamic.jdr;

import java.util.Random;

public class Wolf extends Creature
{

	private Wolf(int strength, int health)
	{
		super(strength, health);
	}

	public static Wolf Create()
	{
		var random = new Random();
		var strength = random.nextInt(3, 8 + 1);
		var health = random.nextInt(5, 10 + 1);
		
		return new Wolf(strength, health);
	}

	@Override
	public String getName() { return "Loup"; }

	@Override
	public int getXP()
	{
		return 1;
	}
}
