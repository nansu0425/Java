
public class LandReptile extends Reptile {

	public LandReptile() {
		super();
		this.move = "walk";
		this.habitat = Habitat.LAND;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LandReptile [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
	
	
	
}
