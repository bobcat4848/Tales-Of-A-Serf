package tech.bobcat.game.util;

public class Story {

	private Moderator gameLogic;
	
	private String question;
	private String[] options;
	
	public Story(Moderator gameLogic) {
		this.gameLogic = gameLogic;
	}
	
	public void storyStart() {
		print("Welcome to Tales of a Serf!", false);
		print(" ", false);
		print("You will begin your life as a lonely serf and make your way to the top.", false);
		
		// Sample question, not actual story
		ask("Would you like to be thy serf?", new String[]{"Yes", "No"});
		if (gameLogic.feedback().equalsIgnoreCase("Yes")) {
			confirmed();
		} else {
			System.exit(0);
		}
	}
	
	// Create separate methods for different progression paths?
	public void confirmed() {
		
	}
	
	
	// Create a battle class and have that entire class handle battle scenes
	public void battle() {
		//Battle instancedBattle = new Battle();
	}
	
	// Logical Commands to simplify story line
	public void print(String str, boolean options) {
		gameLogic.getGameArea().append(str+"\n");
	}
	
	public void ask(String question, String[] options) {
		this.question = question;
		this.options = options;
		print(question, false);
		for (int i = 0; i < options.length; i++) {
			print("- " + options[i], true);
		}
	}
	
	// Getter Methods for Controller and Moderater ( GameLogic ) class to communicate with eacher
	public String getQuestion() {
		return this.question;
	}
	
	public String[] getOptions() {
		return this.options;
	}
}
