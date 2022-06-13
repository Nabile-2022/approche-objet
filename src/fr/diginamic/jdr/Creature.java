package fr.diginamic.jdr;

/*
 * A living being.
 */
public abstract class Creature
{
	private int strength, health;

	public Creature(int strength, int health)
	{
		this.strength = strength;
		this.health = health;
	}
	
	public int getStength() { return strength; }
	
	public int getHealth() { return health; }
	
	/**
	 * Gets experience points upon slaying this creature.
	 */
	public abstract int getXP();
	
	/**
	 * Hurts the creature by 'points' health points.
	 */
	public void hurt(int points) { health -= points; }

	public abstract String getName();
}
