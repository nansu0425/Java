
public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + .10;
	}

}
