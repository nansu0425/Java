
public enum AnimalType {
	// Constants
	MAMMAL(1), BIRD(2), REPTILE(3), AMPHIBIAN(4), FISH(5);
	
	// Field
	private int animalNum;
	
	// Constructor
	AnimalType(int animalType) {
		this.animalNum = animalType;
	}
	
	// Getter
	public int getAnimalNum() {
		return animalNum;
	}
}
