package tech.bobcat.game.items.weapons;

import tech.bobcat.game.items.Item;

public abstract class Weapon extends Item {

	private int damage;
	private int weight;
	
	public Weapon(String itemName, boolean isUseable, int amount, int damage, int weight) {
		super(itemName, isUseable, amount);
		
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
