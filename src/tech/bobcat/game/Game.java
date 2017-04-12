package tech.bobcat.game;

public class Game extends Framework {
		
	public Game game;
	
	public static void main(String[] args) {
		Game session = new Game();
		session.gameLaunch();
	}
	
	public void gameLaunch() {
		game = this;
	}
	

}
