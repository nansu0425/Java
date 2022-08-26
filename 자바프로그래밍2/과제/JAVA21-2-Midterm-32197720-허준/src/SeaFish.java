
public class SeaFish extends Fish {

	public SeaFish() {
		super();
		this.move = "swim";
		this.breath = "grills";
		this.habitat = Habitat.SEA;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SeaFish [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}
}
