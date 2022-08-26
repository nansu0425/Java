import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class EmptyBurger extends Hamburger {
	// Field
	private Image image;	
	
	// Constructor
	public EmptyBurger() {
		setDescription("Empty\t");
		this.image = null;
	}
	
	// Draw image
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		return;
	}
	
	// Cost
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
