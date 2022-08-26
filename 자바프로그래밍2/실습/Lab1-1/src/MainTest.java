
public class MainTest {
	public static void main (String[] args) {
		AmphibiousVehicle car = new AmphibiousVehicle(new DrivableBehavior(), new FloatableBehavior());
		car.move();
		System.out.println(car.getStatus());
		car.fillGas(new Gas());
		car.setStatus(Status.WATER);
		System.out.println(car.getStatus());
		car.move();
		System.out.println(car.name());
	}
}
