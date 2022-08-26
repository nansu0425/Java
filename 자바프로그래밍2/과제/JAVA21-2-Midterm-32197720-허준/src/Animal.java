
public abstract class Animal {
	// Fields
	public String name;
	public String move;
	public String breath;
	public String reproduce;
	public int numberOfLegs;
	public Habitat habitat;
	
	// Constructor
	public Animal(String name, String move, String breath, String reproduce, int numberOfLegs) {
		super();
		this.name = name;
		this.move = move;
		this.breath = breath;
		this.reproduce = reproduce;
		this.numberOfLegs = numberOfLegs;
	}
	public Animal() {
		super();
	}

	// Getters
	public String getName() {
		return name;
	}
	public String getMove() {
		return move;
	}
	public String getBreath() {
		return breath;
	}
	public String getReproduce() {
		return reproduce;
	}
	public int getNumverOfLegs() {
		return numberOfLegs;
	}
	abstract public AnimalType type();
}
