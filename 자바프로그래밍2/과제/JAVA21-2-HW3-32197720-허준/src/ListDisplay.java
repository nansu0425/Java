import java.util.ArrayList;
import java.util.List;

public class ListDisplay implements DisplayElement, Observer {
	
	// Field
	private List<Animal> animals = new ArrayList<> ();
	
	// Add and remove animal
	@Override
	public void onAdded(Animal animal) {
		// TODO Auto-generated method stub
		this.animals.add(animal);
	}
	@Override
	public void onRemoved(Animal animal) {
		// TODO Auto-generated method stub
		int index = this.animals.indexOf(animal);
		if (index >= 0)
			this.animals.remove(index);
	}
	
	// Display
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("List of animals");
		for (Animal animal : this.animals)
			System.out.println(animal);
		System.out.println();
	}

}
