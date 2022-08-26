import java.util.ArrayList;
import java.util.List;

public class KindDisplay implements DisplayElement, Observer {

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
		List<AnimalType> kinds = new ArrayList<>();
		
		boolean equal = false;
		
		System.out.print("Kinds of Animals are ");
		for (Animal animal : this.animals) {
			for (AnimalType kind : kinds) {
				if (animal.type().equals(kind)) {
					equal = true;
				}
			}
				
			if (!equal) {
				kinds.add(animal.type());
				System.out.print(animal.type() + " ");
			}
			equal = false;
		}
		System.out.println();
		System.out.println();
	}

}
