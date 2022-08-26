
public class LandBird extends Bird {

	public LandBird() {
		super();
		this.move = "walk";
		this.habitat = Habitat.LAND;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LandBird [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
}
