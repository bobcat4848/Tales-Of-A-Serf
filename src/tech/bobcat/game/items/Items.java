package tech.bobcat.game.items;

public abstract class Items {

	protected String itemName;
	protected boolean isUseable;
	protected int amount;
	
	public Items(String itemName, boolean isUseable, int amount) {
		this.itemName = itemName;
		this.isUseable = isUseable;
		this.amount = amount;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public boolean isUseable() {
		return isUseable;
	}
}
