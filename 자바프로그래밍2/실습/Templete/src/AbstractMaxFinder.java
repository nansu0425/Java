
public abstract class AbstractMaxFinder {
	
	public double findMax(double[] numbers) {
		double max = numbers[0];
		for (int i = 1; i<numbers.length; i++) {
			if (isLesser(max, numbers[i]))
				max = numbers[i];
		}
		
		return max;
	}
	
	abstract boolean isLesser(double a, double b);
}
