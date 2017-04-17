package tech.bobcat.game.util;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Moderator {

	private JTextArea gameArea;
	private JTextField gameField;
	
	public Moderator(JTextArea gameArea, JTextField gameField) {
		this.gameArea = gameArea;
		this.gameField = gameField;
	}
	
	public void checkValidResponse(String[] respones, String response) {
		int i = 0;
		while (response != respones[i]) {
			i++;
			
			if (respones.length == i) {
				gameArea.append("That's not a valid response, try again!");
				
			}
		}
	}
	
}
