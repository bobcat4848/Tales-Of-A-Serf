package tech.bobcat.game.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import tech.bobcat.game.util.Moderator;

public class Controller implements ActionListener {

	private JTextArea gameArea;
	private JTextField gameField;
	private Moderator gameLogic;
	
	public Controller(JTextArea gameArea, JTextField gameField, Moderator gameLogic) {
		this.gameArea = gameArea;
		this.gameField = gameField;
		this.gameLogic = gameLogic;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gameArea.append(gameField.getText()+"\n");
		
		gameLogic.setMessage(gameField.getText());
		gameLogic.feedback();
		
		gameField.setText("");
	}
}
