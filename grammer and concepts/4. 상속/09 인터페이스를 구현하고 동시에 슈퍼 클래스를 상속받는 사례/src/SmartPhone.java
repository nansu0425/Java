/*
 * SmartPhone 클래스는 PDA를 상속받고, MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한다
 */

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	public void sendSMS() {
		System.out.println("메세지를 보냅니다");
	}
	
	public void receiveSMS() {
		System.out.println("메세지를 받습니다");
	}
	
	public void sendCall() {
		System.out.println("전화를 겁니다");
	}
	
	public void receiveCall() {
		System.out.println("전화를 받습니다");
	}
	
	public void play() {
		System.out.println("음악을 재생합니다");
	}
	
	public void stop() {
		System.out.println("음악을 멈춥니다");
	}
	
	public void schedule() {
		System.out.println("일정을 관리합니다");
	}
}
