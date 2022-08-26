
public class PeriodicElementFactory {
	public static PeriodicElement getInstance(int number, String symbol, String name, double weight, int period, int group, State state, String type) {
		switch (state) {
		case gas :
			return new GasPeriodicElement(number, symbol, name, weight, period, group, state, type);
		case solid :
			return new SolidPeriodicElement(number, symbol, name, weight, period, group, state, type);
		case liq :
			return new LiquidPeriodicElement(number, symbol, name, weight, period, group, state, type);
		case artificial :
			return new UnknownPeriodicElement(number, symbol, name, weight, period, group, state, type);
			default :
				return null;
		}
	}
}
