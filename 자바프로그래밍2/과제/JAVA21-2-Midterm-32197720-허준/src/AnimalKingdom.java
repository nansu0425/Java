import java.util.ArrayList;
import java.util.List;

public class AnimalKingdom implements Subject {
	// Fields
	private List<Observer> observers = new ArrayList<>();
	private List<Animal> animals;
	
	// Constructor
	public AnimalKingdom(List<Animal> animals) {
		super();
		this.animals = animals;
	}
	
	// Add and Remove Animal
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
		notifyObserver(animal, true);
		System.out.println(animal.getName() + " is added to list");
	}	
	public void removeAnimal(Animal animal) {
		int index = this.animals.indexOf(animal);
		if (index >= 0) {
			this.animals.remove(index);
			notifyObserver(animal, false);
			System.out.println(animal.getName() + " in Animal list is deleted");
		}
	}
	
	// Add and Remove Observer
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
		
		if (this.animals.size() != 0) {
			for (Animal a : this.animals)
				o.onAdded(a);
		}
		
		System.out.println(o.getClass().getName() + " is added to list");
		
		if (o instanceof ListDisplay) {
			ListDisplay ld = (ListDisplay) o;
			ld.display();
		} else if (o instanceof PopulationDisplay) {
			PopulationDisplay pd = (PopulationDisplay) o;
			pd.display();
		} else if (o instanceof SurveyDisplay) {
			SurveyDisplay sd = (SurveyDisplay) o;
			sd.display();
		} else if (o instanceof KindDisplay) {
			KindDisplay kd = (KindDisplay) o;
			kd.display();
		}
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index = this.observers.indexOf(o);
		if (index >= 0) {
			this.observers.remove(index);
			System.out.println(o.getClass().getName() + " in Observer list is deleted");
		}
	}
	
	// Notify for all observers
	@Override
	public void notifyObserver(Animal animal, boolean flag) {
		// TODO Auto-generated method stub
		if (flag) { // Add animal
			for (Observer observer : this.observers) 
				observer.onAdded(animal);
		} else { // Remove animal
			for (Observer observer : this.observers) {
				observer.onRemoved(animal);
			}
		}
	}

}
