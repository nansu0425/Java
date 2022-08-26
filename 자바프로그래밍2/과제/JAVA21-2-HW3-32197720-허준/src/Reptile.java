
public class Reptile extends Animal {
	// Constructor
	public Reptile(String name, String move, String breath, String reproduce, int numberOfLegs) {
		super(name, move, breath, reproduce, numberOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType type() {
		// TODO Auto-generated method stub
		return AnimalType.REPTILE;
	}

	@Override
	public String toString() {
		return "Reptile [Name=" + getName() + ", Move=" + getMove() + ", Breath=" + getBreath()
				+ ", Reproduce=" + getReproduce() + ", NumverOfLegs=" + getNumverOfLegs() + "]";
	}
}
