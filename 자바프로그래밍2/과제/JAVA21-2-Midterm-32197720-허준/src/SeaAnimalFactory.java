
public class SeaAnimalFactory extends AbstractAnimalFactory {

	@Override
	public Animal create(AnimalType type) {
		// TODO Auto-generated method stub
		switch (type) {
		case MAMMAL :
			return new SeaMammal();
		case REPTILE :
			return new SeaReptile();
		case FISH :
			return new SeaFish();
		}
		return null;
	}

}
