package tech.bobcat.game.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class InventoryListener implements ActionListener {
	
	private Inventory inventory;
	private JTextArea gameArea;
	
	public InventoryListener(Inventory inventory, JTextArea gameArea) {
		this.inventory = inventory;
		this.gameArea = gameArea;
	}
	
	public void actionPerformed(ActionEvent e) {
		gameArea.append(inventory.displayInventory());
	}
}