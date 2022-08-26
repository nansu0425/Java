import javax.swing.JPanel;
import java.awt.Graphics;

public abstract class Hamburger extends JPanel {
	// Field
	private String description;
	
	// Getter and Setter
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	} 
	
	// Draw
	abstract public void paintComponent(Graphics g);
	
	// Cost
	abstract public double cost();
}
