package tech.bobcat.game.player;

import tech.bobcat.game.listeners.Inventory;

public class Player {
	
    private int health;
    private Inventory playerInventory;
   
    public Player(Inventory playerInventory, int health) {
        this.health = health;
        this.playerInventory = playerInventory;
    }
    
    public Inventory getInventory() {
    	return this.playerInventory;
    }
    
    public int getHealth() {
    	return this.health;
    }
}
