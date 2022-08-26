
public class Amphibian extends Animal {
	// Constructor
	public Amphibian(String name, String move, String breath, String reproduce, int numberOfLegs) {
		super(name, move, breath, reproduce, numberOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType type() {
		// TODO Auto-generated method stub
		return AnimalType.AMPHIBIAN;
	}

	@Override
	public String toString() {
		return "Amphibian [Name=" + getName() + ", Move=" + getMove() + ", Breath=" + getBreath()
				+ ", Reproduce=" + getReproduce() + ", NumverOfLegs=" + getNumverOfLegs() + "]";
	}
}
