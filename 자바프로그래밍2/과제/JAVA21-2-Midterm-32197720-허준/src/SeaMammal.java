
public class SeaMammal extends Mammal {

	public SeaMammal() {
		super();
		this.move = "swim";
		this.habitat = Habitat.SEA;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SeaMammal [name=" + name + ", move=" + move + ", breath=" + breath + ", reproduce=" + reproduce
				+ ", numberOfLegs=" + numberOfLegs + ", habitat=" + habitat + ", type()=" + type() + "]";
	}	
}
