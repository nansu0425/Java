/*
 * PhoneInterface 인터ㅔ이스를 구현하고 flash() 메소드를 추가한 SamsungPhone 클래스를 작성하라
 */

public class InterfaceEx {
	public static void main (String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo(); 
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
