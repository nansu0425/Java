
public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + .18;
	}

}
