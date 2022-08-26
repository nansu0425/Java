import java.util.ArrayList;

public class MainTest {
	// animals field
	private static Animal animals[] = {
			new Bird("Ostrich", "fly", "lungs", "lay eggs", 2),
			new Mammal("Dog", "walk", "lungs", "live birth", 4),
			new Amphibian("Frog", "walk & swim", "lung & grills", "lay eggs", 4),
			new Reptile("Turtle", "walk", "lungs", "lay eggs", 4),
			new Fish("Salman", "swim", "grills", "lay eggs", 0),
			new Mammal("Human", "walk", "lungs", "live birth", 2),
			new Reptile("Snake", "walk", "lungs", "lay eggs", 0),
			new Mammal("Whale", "swim", "lungs", "live birth", 0)
	};
	
	// observers field
	private static Observer observers[] = {
			new ListDisplay(),
			new PopulationDisplay(),
			new SurveyDisplay(),
			new KindDisplay()
	};
	
	// 0~1000ms sleep
	private static void sleep() {
		try {
			Thread.sleep((int)(Math.random()*1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalKingdom animalKingdom = new AnimalKingdom(new ArrayList<>());
		
		// Random sleep add animal
		for (Animal a : animals) {
			sleep();
			animalKingdom.addAnimal(a);
		}
		System.out.println();
		
		// Random sleep delete animal
		int randomIndex[] = new int[3];
		for (int i = 0; i < 3; i++)
			randomIndex[i] = (int) (Math.random()*(animals.length));	
		for (int i = 0; i < randomIndex.length; i++) {
			sleep();
			animalKingdom.removeAnimal(animals[randomIndex[i]]);
		}
		System.out.println();
		
		// Random sleep add observer
		for (Observer o : observers) {
			sleep();
			animalKingdom.addObserver(o);
		}
		
		// Random sleep delete observer
		for (Observer o : observers) {
			sleep();
			animalKingdom.removeObserver(o);
		}
	}

}
