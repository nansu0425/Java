
public class AbsNumMaxFinder extends AbstractMaxFinder {

	@Override
	boolean isLesser(double a, double b) {
		return Math.abs(a) < Math.abs(b);
	}

}
