package tech.bobcat.game.items.weapons;

import tech.bobcat.game.items.Items;

public abstract class Weapon extends Items {

	private int damage;
	private int weight;
	
	public Weapon(String itemName, boolean isUseable, int damage, int weight) {
		super(itemName, isUseable);
		
		this.damage = damage;
		this.weight = weight;
	}
	
	public int getDamage() {
		return damage;
	}

	public int getWeight() {
		return weight;
	}
}
