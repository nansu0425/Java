
public abstract class PeriodicElement {
	private int number;
	private String symbol;
	private String name;
	private double weight;
	private int period;
	private int group;
	private State state;
	private String type;
	
	public PeriodicElement(int number, String symbol, String name, double weight, int period, int group, State state, String type) {
		super();
		this.number = number;
		this.symbol = symbol;
		this.name = name;
		this.weight = weight;
		this.period = period;
		this.group = group;
		this.state = state;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PeriodicElement [number=" + number + ", symbol=" + symbol + ", name=" + name + ", weight=" + weight
				+ ", period=" + period + ", group=" + group + ", state=" + state + ", type=" + type + "]";
	}
}
