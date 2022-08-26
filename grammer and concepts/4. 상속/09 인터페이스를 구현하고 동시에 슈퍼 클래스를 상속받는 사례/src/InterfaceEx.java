/*
 * 인터페이스를 구현하고 동시에 슈퍼 클래스를 상속받는 사례
 */

public class InterfaceEx {
	public static void main (String[] args) {
		SmartPhone phone = new SmartPhone();
		
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}
}
