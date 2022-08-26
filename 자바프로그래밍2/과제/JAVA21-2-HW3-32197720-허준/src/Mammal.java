
public class Mammal extends Animal {
	// Constructor
	public Mammal(String name, String move, String breath, String reproduce, int numberOfLegs) {
		super(name, move, breath, reproduce, numberOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType type() {
		// TODO Auto-generated method stub
		return AnimalType.MAMMAL;
	}

	@Override
	public String toString() {
		return "Mammal [Name=" + getName() + ", Move=" + getMove() + ", Breath=" + getBreath()
				+ ", Reproduce=" + getReproduce() + ", NumverOfLegs=" + getNumverOfLegs() + "]";
	}
}
