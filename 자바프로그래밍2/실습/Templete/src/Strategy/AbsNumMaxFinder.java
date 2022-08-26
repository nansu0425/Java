package Strategy;

public class AbsNumMaxFinder implements Comperator {

	@Override
	public boolean isLesser(double a, double b) {
		// TODO Auto-generated method stub
		return Math.abs(a) < Math.abs(b);
	}

}
