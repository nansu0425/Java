package Strategy;

public class MainTest {

	public static void main(String[] args) {
		double[] numbers = {-20.5, 87.3, 12.3, -5.7, 65.4, -97};
		
		MaxFinder finder = new MaxFinder(new NaturalNumMaxFinder());
		System.out.println("Max : " + finder.findMax(numbers));
		
		finder.setComperator(new AbsNumMaxFinder());
		System.out.println("absMax : " + finder.findMax(numbers));
	}

}
