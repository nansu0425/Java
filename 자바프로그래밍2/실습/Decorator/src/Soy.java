
public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + .15;
	}

}
