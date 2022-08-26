
public class MainTest {

	public static void main(String[] args) {
		double[] numbers = {-20.5, 87.3, 12.3, -5.7, 65.4, -97};
		
		AbstractMaxFinder finder = new NaturalNumMaxFinder();
		double max = finder.findMax(numbers);
		System.out.println("Max : " + max);
		
		finder = new AbsNumMaxFinder();
		double absMax = finder.findMax(numbers);
		System.out.println("absMax : " + absMax);
	}

}
