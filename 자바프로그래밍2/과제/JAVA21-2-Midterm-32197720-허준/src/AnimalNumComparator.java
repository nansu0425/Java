import java.util.Comparator;

public class AnimalNumComparator implements Comparator<Animal> {
	// AnimalNum Compare
	@Override
	public int compare(Animal a1, Animal a2) {
		if (a1.type().getAnimalNum() > a2.type().getAnimalNum())
			return 1;
		else if (a1.type().getAnimalNum() < a2.type().getAnimalNum())
			return -1;
		
		return 0;
	}
}
