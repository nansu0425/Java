
public class Fish extends Animal {
	// Constructor
	public Fish(String name, String move, String breath, String reproduce, int numberOfLegs) {
		super(name, move, breath, reproduce, numberOfLegs);
		// TODO Auto-generated constructor stub
	}
	
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public AnimalType type() {
		// TODO Auto-generated method stub
		return AnimalType.FISH;
	}

	@Override
	public String toString() {
		return "Fish [Name=" + getName() + ", Move=" + getMove() + ", Breath=" + getBreath()
				+ ", Reproduce=" + getReproduce() + ", NumverOfLegs=" + getNumverOfLegs() + "]";
	}
}
