package tech.bobcat.game.items.potions;

import tech.bobcat.game.items.Item;

public abstract class Potion extends Item {

	public Potion(String itemName, boolean isUseable, int amount) {
		super(itemName, isUseable, amount);
		
	}

}
