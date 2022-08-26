
public class AmphibiousVehicle extends Vehicle implements Floatable, Drivable {
	private Status status;
	
	public AmphibiousVehicle(Status status) {
		super();
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public void move() {
		if (this.status == Status.LAND)
			driveInLand();
		else if (this.status == Status.WATER)
			floatOnWater();
	}
	
	@Override
	public String name() {
		return "AmphibiousVehicle";
	}
	
	@Override
	public void driveInLand() {
		System.out.println("It drives in land");
	}
	
	@Override
	public void floatOnWater() {
		System.out.println("It floats on water");
	}
	
	public static void main (String[] args) {
		AmphibiousVehicle av = new AmphibiousVehicle(Status.LAND);
		
		av.move();
		System.out.println(av.getStatus());
		av.fillGas(new Gas());
		av.setStatus(Status.WATER);
		av.move();
		System.out.println(av.getStatus());
		System.out.println(av.name());
	}
}
