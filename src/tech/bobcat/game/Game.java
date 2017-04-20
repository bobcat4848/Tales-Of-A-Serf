package tech.bobcat.game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.border.LineBorder;

import tech.bobcat.game.listeners.Controller;
import tech.bobcat.game.listeners.Inventory;
import tech.bobcat.game.listeners.InventoryListener;
import tech.bobcat.game.player.Player;
import tech.bobcat.game.util.Moderator;
import tech.bobcat.game.util.Story;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Game {

	// UI Elements
	private JFrame gameFrame;
	private JTextArea gameArea;
	private JTextField gameField;
	
	// Game Objects
	private Player player = new Player(new Inventory(), 20);
	private Moderator gameLogic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.gameFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
		
		gameLogic.begin();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gameFrame = new JFrame();
		gameFrame.setResizable(false);
		gameFrame.setTitle("Tales of a Serf");
		gameFrame.setBounds(100, 100, 1000, 500);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.getContentPane().setLayout(null);
		
		gameArea = new JTextArea();
		gameArea.setFont(new Font("Arial", Font.BOLD, 15));
		gameArea.setEditable(false);		
		JScrollPane gameAreaScroll = new JScrollPane(gameArea);
		gameAreaScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		gameAreaScroll.setBounds(10, 11, 974, 250);
		gameFrame.getContentPane().add(gameAreaScroll);
		
		gameField = new JTextField();
		gameField.setFont(new Font("Arial", Font.PLAIN, 20));
		gameField.setBounds(10, 262, 974, 35);
		gameField.addActionListener(new Controller(gameArea, gameField, gameLogic));
		gameFrame.getContentPane().add(gameField);
		gameField.setColumns(10);
	
		gameLogic = new Moderator(gameArea, gameField);
		
		JPanel buttonRegion = new JPanel();
		buttonRegion.setBounds(10, 308, 600, 152);
		gameFrame.getContentPane().add(buttonRegion);
		buttonRegion.setLayout(new GridLayout(2, 2, 5, 5));
		
		JButton inventoryButton = new JButton("Inventory");
		inventoryButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		inventoryButton.addActionListener(new InventoryListener(player.getInventory(), gameArea));
		buttonRegion.add(inventoryButton);
		
		JButton mapButton = new JButton("Map");
		mapButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonRegion.add(mapButton);
		
		JButton statsButton = new JButton("Stats");
		statsButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonRegion.add(statsButton);
		
		JButton monpediaButton = new JButton("Monpedia");
		monpediaButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		buttonRegion.add(monpediaButton);
		
		JPanel healthRegion = new JPanel();
		healthRegion.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		healthRegion.setBounds(620, 308, 364, 152);
		gameFrame.getContentPane().add(healthRegion);
		healthRegion.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		healthRegion.add(panel, BorderLayout.CENTER);
		
		JLabel healthImage = new JLabel("");
		panel.add(healthImage);
		healthImage.setIcon(new ImageIcon(Game.class.getResource("/tech/bobcat/game/images/heart.png")));
		healthImage.setForeground(Color.RED);
		healthImage.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel hp = new JLabel("20");
		panel.add(hp);
		hp.setForeground(Color.RED);
		hp.setFont(new Font("Tahoma", Font.BOLD, 99));
	}
}
