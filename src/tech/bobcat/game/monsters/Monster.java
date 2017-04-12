package tech.bobcat.game.monsters;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Monster {

	private int health;
	private int damageMin;
	private int damageMax;
	
	public Monster(int health, int damageMin, int damageMax) {
		this.health = health;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
	}
	
	// Returns random damage amount between min and max variables
	public int damage() {
		return ThreadLocalRandom.current().nextInt(damageMin, damageMax + 1);
	}
	
	// Set Method(s)
	public void setHealth(int health) {
		this.health = health;
	}
	
	// Get Method(s)
	public int getHealth() {
		return this.health;
	}
	
	public int getDamageMin() {
		return this.damageMin;
	}
	
	public int getDamageMax() {
		return this.damageMax;
	}
}
