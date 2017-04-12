package tech.bobcat.game;

import java.awt.*;
import javax.swing.*;
 
public abstract class Framework {
	// Top-level UI
    private JFrame gameFrame;

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
       gameFrame.setLayout(new BorderLayout());
       gameFrame.setSize(1000, 600);
       //gameFrame.setResizable(false);
       gameFrame.setVisible(true);

       constructJMenuBar();
       constructTextRegion();
       constructButtons();
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
    	
    	gameFrame.add(textRegion, BorderLayout.NORTH);
    }
    
    public void constructButtons() {
    	formButtons("Button 1", "Button 2", "Button 3", "Button 4");
    	
    	JPanel buttons = new JPanel();
    	buttons.setLayout(new GridLayout(2, 2));
    	
    	buttons.add(topLeftButton);
    	buttons.add(topRightButton);
    	buttons.add(bottomLeftButton);
    	buttons.add(bottomRightButton);
    	
    	gameFrame.add(buttons, BorderLayout.EAST);
    }
    
    public void constructHealth() {
    	JPanel healthRegion = new JPanel();
    	healthRegion.setLayout(new FlowLayout());
    	
    	
    }
}