package iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList("Seoul", "Busan", "Incheon", "Ulsan", "Daejeon"));
		Iterator<?> iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
