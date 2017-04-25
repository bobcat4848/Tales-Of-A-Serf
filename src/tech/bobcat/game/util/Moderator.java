package tech.bobcat.game.util;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Moderator {

	private JTextArea gameArea;
	private JTextField gameField;
	private Story storyLine = new Story(this);
	
	private String lastMessage = "";
	
	public Moderator(JTextArea gameArea, JTextField gameField) {
		this.gameArea = gameArea;
		this.gameField = gameField;
	}
	
	public String feedback() {
		while (!checkValidResponse(storyLine.getOptions(), lastMessage)) {
			gameArea.append("Invalid Response! Enter a valid response!");
			storyLine.ask(storyLine.getQuestion(), storyLine.getOptions());
		}
		
		return lastMessage;
	}
	
	public boolean checkValidResponse(String[] responses, String response) {
		boolean valid = false;
		while(!valid) {
			for (int i = 0; i < responses.length; i++) {
				if (response.equalsIgnoreCase(responses[i])) {
					valid = true;
					break;
				} 
				valid = false;
			}
		}
		
		
		return valid;
	}
	
	
	public void begin() {
		storyLine.storyStart();
	}
	
	
	// Get main game components
	// These getter methods are the most vital among all!
	public JTextArea getGameArea() {
		return this.gameArea;
	}
	
	public JTextField getGameField() {
		return this.gameField;
	}
	
	public Story getStory() {
		return this.storyLine;
	}
	
	public void setMessage(String message) {
		this.lastMessage = message;
	}
}
