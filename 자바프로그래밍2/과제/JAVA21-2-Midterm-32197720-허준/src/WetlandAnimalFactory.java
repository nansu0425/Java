
public class WetlandAnimalFactory extends AbstractAnimalFactory {

	@Override
	public Animal create(AnimalType type) {
		// TODO Auto-generated method stub
		switch(type) {
		case MAMMAL :
			return new WetlandMammal();
		case BIRD :
			return new WetlandBird();
		case REPTILE :
			return new WetlandReptile();
		case AMPHIBIAN :
			return new WetlandAmphibian();
		case FISH :
			return new WetlandFish();
		}
		return null;
	}

}
