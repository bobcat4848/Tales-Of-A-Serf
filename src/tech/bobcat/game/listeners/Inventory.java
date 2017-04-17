package tech.bobcat.game.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import tech.bobcat.game.items.Item;
import tech.bobcat.game.items.potions.Potion;
import tech.bobcat.game.items.weapons.Weapon;

public class Inventory {

	private ArrayList<Item> inventory = new ArrayList<>();
	
	// Items already in inventory, initialize inventory when first item is stored?
	public Inventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	
	// Creates an empty inventory system
	public Inventory() {}
	
	public void addItem(Item item) {
		inventory.add(item);
	}
	
	public void addItems(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			inventory.add(items[i]);
		}
	}
	
	public String displayInventory() {
		if (inventory.size() == 0) return "Nothing is in your inventory.\n";
		String display = "";
		String weapons = "Weapons: \n";
		String potions = "Potions: \n";
		String other = "Other: \n";
		
		for (Item item : inventory) {
			if (item instanceof Weapon) {
				weapons += item.getItemName() + "\n";
			} else if (item instanceof Potion) {
				potions += item.getItemName() + "\n";
			} else {
				other += item.getItemName() + "\n";
			}
		}
		
		display = weapons + potions + other;
		return display;
	}
}
