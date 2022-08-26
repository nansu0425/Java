
public class LandAmphibian extends Amphibian {

	public LandAmphibian() {
		super();
		this.move = "walk";
		this.habitat = Habitat.LAND;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LandAmphibian [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
}
