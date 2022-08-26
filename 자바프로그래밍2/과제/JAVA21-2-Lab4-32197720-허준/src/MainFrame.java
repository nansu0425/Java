import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame implements ActionListener {
	// Field
	private JButton[] buttons = new JButton[9]; // Buttons
	private Hamburger hamburger = new EmptyBurger(); // Default 
	private JPanel displayPanel; 
	
	// Constructor
	public MainFrame() {
		setTitle("Hamburger Stack");
		setSize(500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayPanel = new JPanel(new BorderLayout());
		displayPanel.add(hamburger);
		
		// Buttons
		buttons[0] = new JButton("BeefPatty");
		buttons[1] = new JButton("ChickenPatty");
		buttons[2] = new JButton("ShirimpPatty");
		buttons[3] = new JButton("Cheese");
		buttons[4] = new JButton("Lettuce");
		buttons[5] = new JButton("Onion");
		buttons[6] = new JButton("Tomato");
		buttons[7] = new JButton("Start Stack Burger"); // BottomBun
		buttons[8] = new JButton("Finish"); // TopBun
		
		JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
		
		// Add buttons
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
			buttonPanel.add(buttons[i]);
		}
		add(displayPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		displayPanel.remove(hamburger);
		
		if (buttons[0].equals(e.getSource())) {
			hamburger = new BeefPatty(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();
		} else if (buttons[1].equals(e.getSource())) {
			hamburger = new ChickenPatty(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[2].equals(e.getSource())) {
			hamburger = new ShirimpPatty(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[3].equals(e.getSource())) {
			hamburger = new CheeseTopping(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[4].equals(e.getSource())) {
			hamburger = new LettuceTopping(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[5].equals(e.getSource())) {
			hamburger = new OnionTopping(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[6].equals(e.getSource())) {
			hamburger = new TomatoTopping(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[7].equals(e.getSource())) {
			hamburger = new BottomBun();
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		} else if (buttons[8].equals(e.getSource())) {
			hamburger = new TopBun(hamburger);
			displayPanel.add(hamburger);
			displayPanel.revalidate();
			displayPanel.repaint();			
		}
	}
}
