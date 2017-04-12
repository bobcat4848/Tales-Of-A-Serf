package tech.bobcat.game;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
 
public abstract class Framework {
	// Top-level UI
    private JFrame gameFrame;
    
    // Add items to gameAreaGBC panel, not the JFrame itself!
	private JPanel gameAreaGBC;
	private GridBagConstraints gbc;
	
	private JPanel gameAreaINGBC;

    // Low-level UI
    private JButton topLeftButton, topRightButton, bottomLeftButton, bottomRightButton;
    private JTextField healthText;
    private String topLeftText, topRightText, bottomLeftText, bottomRightText;
    
    private JTextArea gameArea;
    private JTextField gameInput;
    
    public Framework() {
        // Create entire window frame here
       gameFrame = new JFrame();
       gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //gameFrame.setLayout(new BorderLayout());
       gameFrame.setSize(1200, 800);
       gameFrame.setResizable(false);
       gameFrame.setVisible(true);

       gameAreaGBC = new JPanel(new GridBagLayout());
       gbc = new GridBagConstraints();
       gbc.ipadx = 500;
       gbc.ipady = 500;
       
       gameAreaGBC.setBackground(Color.CYAN);
       
       gameAreaINGBC = new JPanel(new BorderLayout());
       
       gameFrame.add(gameAreaGBC);
       
       constructJMenuBar();
       constructTextRegion();
       //constructButtons();
       constructHealth();
       
       gameFrame.repaint();
       gameFrame.revalidate();
    }
   
    // Links the string messages to the JButton itself
    private void formButtons(String topLeftText, String topRightText, String bottomLeftText, String bottomRightText) {
        topLeftButton = new JButton(topLeftText);
        topRightButton = new JButton(topRightText);
        bottomLeftButton = new JButton(bottomLeftText);
        bottomRightButton = new JButton(bottomRightText);
    }
    
    // Return a panel full of components perhaps?
    public void constructJMenuBar() {
    	// Hierarchy reference below
    	JMenuBar appBar = new JMenuBar();
    	JMenu file = new JMenu();
    	JMenuItem save = new JMenuItem();
    }
    
    public void constructTextRegion() {
    	JPanel textRegion = new JPanel();
    	textRegion.setLayout(new BorderLayout());
    	
    	gameArea = new JTextArea(10, 20);
    	gameInput = new JTextField();
    	
    	textRegion.add(gameArea, BorderLayout.CENTER);
    	textRegion.add(gameInput, BorderLayout.SOUTH);
    	
    	gameAreaGBC.add(textRegion, gbc);
    }
    
    
    public void constructButtons() {
    	formButtons("Button 1", "Button 2", "Button 3", "Button 4");
    	
    	JPanel buttons = new JPanel();
    	buttons.setLayout(new GridLayout(2, 2));
    	
    	buttons.add(topLeftButton);
    	buttons.add(topRightButton);
    	buttons.add(bottomLeftButton);
    	buttons.add(bottomRightButton);
    	
    	buttons.setPreferredSize(new Dimension(500, 25));
    	
    	gameFrame.add(buttons, BorderLayout.WEST);
    }
    
    public void constructHealth() {
    	JPanel healthRegion = new JPanel();
    	healthRegion.setLayout(new FlowLayout());
    	
    	
    }
}