import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityGroup extends CityComponent {
	private List<CityComponent> cities = new ArrayList<CityComponent>(); 
	
	// add city
	public void add(CityComponent c) {
		cities.add(c);
	}
	
	// remove city
	public void remove(CityComponent c) {
		cities.remove(c);
	}
	
	// get city of index i
	public CityComponent getChild(int i) {
		return (CityComponent)cities.get(i);
	}
	
	// print cities
	public void print() {
		System.out.println("------------------");
		
		Iterator<CityComponent> iterator = cities.iterator();
		while (iterator.hasNext()) {
			CityComponent menuComponent = 
				(CityComponent)iterator.next();
			menuComponent.print();
		}
	}
}
