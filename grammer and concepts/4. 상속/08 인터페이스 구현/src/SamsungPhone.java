
public class SamsungPhone implements PhoneInterface {
	public void sendCall() { //전화가 갈 때 
		System.out.println("띠리릴리링");
	}
	
	public void receiveCall() { //전화가 올 때
		System.out.println("전화가 왔습니다");
	}
	
	public void flash() { //flash를 킬 때
		System.out.println("전화기에 불이 켜졌습니다");
	}
}
