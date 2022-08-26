
public class WetlandAmphibian extends Amphibian {

	public WetlandAmphibian() {
		super();
		this.move = "walk&swim";
		this.habitat = Habitat.WETLAND;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WetlandAmphibian [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
	
	
}
