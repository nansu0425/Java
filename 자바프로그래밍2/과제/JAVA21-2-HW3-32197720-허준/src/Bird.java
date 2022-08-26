
public class Bird extends Animal {
	// Constructor
	public Bird(String name, String move, String breath, String reproduce, int numberOfLegs) {
		super(name, move, breath, reproduce, numberOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AnimalType type() {
		// TODO Auto-generated method stub
		return AnimalType.BIRD;
	}

	@Override
	public String toString() {
		return "Bird [Name=" + getName() + ", Move=" + getMove() + ", Breath=" + getBreath()
				+ ", Reproduce=" + getReproduce() + ", NumverOfLegs=" + getNumverOfLegs() + "]";
	}
	
	
}
