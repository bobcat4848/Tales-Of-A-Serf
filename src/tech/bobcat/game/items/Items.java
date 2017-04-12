package tech.bobcat.game.items;

public abstract class Items {

	private String itemName;
	private boolean isUseable;
	
	public Items(String itemName, boolean isUseable) {
		this.itemName = itemName;
		this.isUseable = isUseable;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public boolean isUseable() {
		return isUseable;
	}
}
