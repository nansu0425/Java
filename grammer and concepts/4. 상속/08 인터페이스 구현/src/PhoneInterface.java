
interface PhoneInterface {
	int TIMEOUT = 10000; //상수 필드 선언, public static final 생략
	void sendCall(); //추상 메소드, public abstract 생략
	void receiveCall(); //추상 메소드, public abstract 생략
	default void printLogo() { //default 메소드, public 생략
		System.out.println("**Phone**");
	}
}
