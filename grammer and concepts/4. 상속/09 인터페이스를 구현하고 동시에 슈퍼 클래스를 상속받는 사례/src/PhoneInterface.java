
interface PhoneInterface {
	int TIMEOUT = 10000; //상수 필드
	void sendCall(); //추상 메소드
	void receiveCall(); //추상 메소드
	default void printLogo() { //Phone 출력 메소드
		System.out.println("**Phone**");
	}
}
