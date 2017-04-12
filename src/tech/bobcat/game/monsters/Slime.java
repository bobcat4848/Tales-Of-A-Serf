package tech.bobcat.game.monsters;

public class Slime extends Monster {

	private String name;
	private String color;
	
	public Slime(String name, String color, int health, int damageMin, int damageMax) {
		super(health, damageMin, damageMax);
		this.name = name;
		this.color = color;
	}
	
	
}
