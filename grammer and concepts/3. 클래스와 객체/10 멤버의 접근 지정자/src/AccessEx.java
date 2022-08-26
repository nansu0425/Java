/*
 * 접근 지정자 예제
 */
public class AccessEx {
	public static void main (String[] args) {
		Sample sample = new Sample();
		sample.a = 10; //public의 경우 패키지 상관없이 모든 클래스에서 접근 가능
		sample.b = 10; //private의 경우 클래스 내에서만 접근 가능
		sample.c = 10; //default의 경우 같은 패키지의 클래스에서 접근 가능
	}
}
