
public class WetlandBird extends Bird {

	public WetlandBird() {
		super();
		this.move = "walk&swim";
		this.habitat = Habitat.WETLAND;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WetlandBird [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
}
