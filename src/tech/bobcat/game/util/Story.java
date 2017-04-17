package tech.bobcat.game.util;

import javax.swing.JTextArea;

public class Story {

	private Moderator gameLogic;
	private JTextArea gameArea;
	
	public Story(JTextArea gameArea, Moderator gameLogic) {
		this.gameArea = gameArea;
	}
	
	public void start() {
		print("Welcome to Tales of a Serf!");
		print("");
		print("You will begin your life as a lonely serf and make your way to the top.");
		print("Would you like to be thy serf?");
		print("- Yes");
		print("- No");
	}
	
	public void print(String str) {
		gameArea.append(str+"\n");
	}
	
	public void ask(String question, String[] options) {
		print(question);
		for (int i = 0; i < options.length; i++) {
			print("- " + options[i]);
		}
	}
	
}
