package Strategy;

public class MaxFinder {
	Comperator comperator;

	public Comperator getComperator() {
		return comperator;
	}

	public void setComperator(Comperator comperator) {
		this.comperator = comperator;
	}
	
	public double findMax(double[] numbers) {
		double max = numbers[0];
		for (int i = 1; i<numbers.length; i++) {
			if (comperator.isLesser(max, numbers[i]))
				max = numbers[i];
		}
		
		return max;
	}

	public MaxFinder(Comperator comperator) {
		super();
		this.comperator = comperator;
	}
}
