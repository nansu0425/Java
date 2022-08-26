import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("------------------DynamicArray------------------");
		// DynamicArray
		DataCollection<City> arr = new DynamicArray<>();
		
		// put
		System.out.println("\n\nDynamicArray put & print");
		arr.put(new City("Seoul", "Korea"));
		arr.put(new City("Yongin", "Korea"));
		arr.put(new City("Toronto", "Canada"));
		arr.put(new City("Vancouver", "Canada"));
		arr.put(new City("Paris", "France"));
		arr.put(new City("Berlin", "Germany"));
		arr.put(new City("London", "United Kingdom"));
		arr.put(new City("Birmingham", "United Kingdom"));
		arr.forEach(System.out::println);
		
		// remove
		System.out.println("\n\nDynamicArray remove & print");
		arr.remove(3);
		arr.remove(6);
		for(Iterator<City> itr = arr.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		// insert
		System.out.println("\n\nDynamicArray insert & print");
		arr.insert(5, new City("Vancouver", "Canada"));
		arr.insert(2, new City("Birmingham", "United Kingdom"));
		Iterator<City> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// elemAt
		System.out.println("\n\nDynamicArray elemAt & print");
		System.out.println(arr.elemAt(1));
		System.out.println(arr.elemAt(4));
		
		
		// clear
		System.out.println("\n\nDynamicArray clear & print");
		arr.clear();
		arr.forEach(System.out::println);
		
		System.out.println("------------------ArrayList------------------");
		// ArrayList
		ArrayList<City> list = new ArrayList<>();
		
		// add and remove
		list.add(new City("Seoul", "Korea"));
		list.add(new City("Yongin", "Korea"));
		list.add(new City("Toronto", "Canada"));
		list.add(new City("Vancouver", "Canada"));
		list.add(new City("Paris", "France"));
		list.add(new City("Berlin", "Germany"));
		list.add(new City("London", "United Kingdom"));
		list.add(new City("Birmingham", "United Kingdom"));
		list.remove(7);
		list.remove(6);
		
		// ArrayList Adapter
		DataCollection<City> arr2 = new ArrayListDataCollectionAdapter<>(list);
		
		// put
		System.out.println("\n\nArrayListDataCollectionAdapter put & print");
		arr2.put(new City("London", "United Kingdom"));
		arr2.put(new City("Birmingham", "United Kingdom"));
		arr2.put(new City("Chicago", "USA"));
		arr2.put(new City("Los Angeles", "USA"));
		arr2.forEach(System.out::println);
		
		// remove
		System.out.println("\n\nArrayListDataCollectionAdapter remove & print");
		arr2.remove(0);
		arr2.remove(8);
		for(itr = arr2.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		// insert
		System.out.println("\n\nArrayListDataCollectionAdapter insert & print");
		arr2.insert(3, new City("Seoul", "Korea"));
		arr2.insert(6, new City("Los Angeles", "USA"));
		itr = arr2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// elemAt
		System.out.println("\n\nArrayListDataCollectionAdapter elemAt & print");
		System.out.println(arr2.elemAt(4));
		System.out.println(arr2.elemAt(2));
		
		
		// clear
		System.out.println("\n\nArrayListDataCollectionAdapter clear & print");
		arr2.clear();
		arr2.forEach(System.out::println);
		
		System.out.println("------------------Stack------------------");
		// Stack
		Stack<City> stack = new Stack<>();
		
		// push and pop
		stack.push(new City("Seoul", "Korea"));
		stack.push(new City("Yongin", "Korea"));
		stack.push(new City("Toronto", "Canada"));
		stack.push(new City("Vancouver", "Canada"));
		stack.push(new City("Paris", "France"));
		stack.push(new City("Berlin", "Germany"));
		stack.push(new City("London", "United Kingdom"));
		stack.push(new City("Birmingham", "United Kingdom"));
		stack.pop();
		stack.pop();
		
		// Stack Adapter
		DataCollection<City> arr3 = new ArrayListDataCollectionAdapter<>(stack);
		
		// put
		System.out.println("\n\nArrayListDataCollectionAdapter put & print");
		arr3.put(new City("London", "United Kingdom"));
		arr3.put(new City("Birmingham", "United Kingdom"));
		arr3.put(new City("New York", "USA"));
		arr3.put(new City("Boston", "USA"));
		arr3.forEach(System.out::println);
		
		// remove
		System.out.println("\n\nArrayListDataCollectionAdapter remove & print");
		arr3.remove(4);
		arr3.remove(7);
		for(itr = arr3.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		// insert
		System.out.println("\n\nArrayListDataCollectionAdapter insert & print");
		arr3.insert(5, new City("Paris", "France"));
		arr3.insert(1, new City("New York", "USA"));
		itr = arr3.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// elemAt
		System.out.println("\n\nArrayListDataCollectionAdapter elemAt & print");
		System.out.println(arr3.elemAt(9));
		System.out.println(arr3.elemAt(3));
		
		// clear
		System.out.println("\n\nArrayListDataCollectionAdapter clear & print");
		arr3.clear();
		arr3.forEach(System.out::println);
	}
}
