import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChickenPatty extends HamburgerIngredient {
	// Field
	private Hamburger hamburger;
	private Image image;
		
	// Constructor
	public ChickenPatty(Hamburger hamburger) {
		this.hamburger = hamburger;
		File imageFile = new File("HW4-image/ChickenPatty.png");
		try {
			this.image = ImageIO.read(imageFile);
		} catch(IOException e) {
		}
	}
	
	// Description
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.hamburger.getDescription() + "ChickenPatty\t";
	}

	// Draw image
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		this.hamburger.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		if (this.image != null) g2.drawImage(this.image, 125, 150, 330, 300, this);
	}
	
	// Cost
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1500;
	}
}
