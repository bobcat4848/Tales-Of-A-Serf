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
       gameFrame.setSize(1200, 800);
       gameFrame.setResizable(false);
       gameFrame.setVisible(true);

       makeInnerRegion();
       
       gameAreaGBC.add(gameAreaINGBC, gbc);
       gameFrame.add(gameAreaGBC);
       
       constructJMenuBar();
       constructTextRegion();
       constructButtons();
       //constructHealth();
       
       gameFrame.repaint();
       gameFrame.revalidate();
    }
   
    public void makeInnerRegion() {
        gameAreaGBC = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.ipadx = 1150;
        gbc.ipady = 700;
        
        gameAreaGBC.setBackground(Color.CYAN);
        
        gameAreaINGBC = new JPanel(new BorderLayout());
        gameAreaINGBC.setBackground(Color.BLACK);
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
    	
    	gameAreaINGBC.add(textRegion, BorderLayout.NORTH);
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
    	
    	gameAreaINGBC.add(buttons, BorderLayout.WEST);
    }
    
    public void constructHealth() {
    	JPanel healthRegion = new JPanel();
    	healthRegion.setLayout(new FlowLayout());
    	
    	ImageIcon icon = new ImageIcon(this.getClass().getResource("images/heart.png"));
    	JLabel iconLabel = new JLabel(icon);
    	
    	healthRegion.add(iconLabel);
    	
    	gameAreaINGBC.add(healthRegion, BorderLayout.EAST);
    }
}