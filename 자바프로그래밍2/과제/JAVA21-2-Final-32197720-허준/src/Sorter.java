
public class Sorter<T> {
	Comparator<T> comparator;
	
	// Constructor
	public Sorter(Comparator<T> comparator) {
		this.comparator = comparator;
	}
	
	// Bubble Sort
	final void bubbleSort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0) { 
                	swap(data, j, j + 1); // swap
                }
            }
        }
    }
	
	// Swap
    void swap(T[] data, int i, int j) {
		T temp = data[i];
		data[i] = data[j];
		data[j] = temp;
    }
}
