package tech.bobcat.game.util;

public class Story {

	private Moderator gameLogic;
	
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
	}
	
	public void print(String str, boolean options) {
		gameLogic.getGameArea().append(str+"\n");
	}
	
	public void ask(String question, String[] options) {
		this.options = options;
		print(question, false);
		for (int i = 0; i < options.length; i++) {
			print("- " + options[i], true);
		}
	}
	
	// Create a battle class and have that entire class handle battle scenes
	public void battle() {
		//Battle instancedBattle = new Battle();
	}
	
	public String[] getOptions() {
		return this.getOptions();
	}
}
