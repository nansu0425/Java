
public class LandAnimalFactory extends AbstractAnimalFactory {
	@Override
	public Animal create(AnimalType type) {
		// TODO Auto-generated method stub
		switch (type) {
		case MAMMAL :
			return new LandMammal();
		case BIRD :
			return new LandBird();
		case REPTILE :
			return new LandReptile();
		case AMPHIBIAN :
			return new LandAmphibian();
		}
		return null;
	}

}
