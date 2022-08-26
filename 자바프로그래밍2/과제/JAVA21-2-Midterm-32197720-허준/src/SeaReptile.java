
public class SeaReptile extends Reptile {

	public SeaReptile() {
		super();
		this.move = "swim";
		this.habitat = Habitat.SEA;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SeaReptile [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
}
