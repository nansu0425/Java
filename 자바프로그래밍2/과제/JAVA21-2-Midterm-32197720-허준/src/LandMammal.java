
public class LandMammal extends Mammal {

	public LandMammal() {
		super();
		this.move = "walk";
		this.habitat = Habitat.LAND;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LandMammal [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
}
