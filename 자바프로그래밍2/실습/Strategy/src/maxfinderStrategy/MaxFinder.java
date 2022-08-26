package maxfinderStrategy;

public class MaxFinder {
	Comparator comparator = null;
	
	public MaxFinder(Comparator comparator) {
		this.comparator = comparator;
	}

	public Comparator getComparator() {
		return comparator;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	// template method
	public double findMax(double[] numbers) {
		double max = numbers[0];
		for (int i=1; i<numbers.length; i++) {
			if (comparator.isLesser(max, numbers[i]))
				max = numbers[i];
		}
		return max;
	}

	// primitive operation
	//abstract boolean isLesser(double a, double b);
}
