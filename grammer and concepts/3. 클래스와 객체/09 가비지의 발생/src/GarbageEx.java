/*
 * 가비지 발생의 예
 */

public class GarbageEx {
	public static void main (String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null; //원래 a가 가리키고 있던 객체는 참조할 수 없게 되므로 가비지가 된다
		d = c; //d는 c가 가리키는 객체의 레퍼런스 변수가 된다
		c = null; //c가 아무것도 가리키지 않더라도 d가 c가 가리키던 객체의 레퍼런스 변수이므로 c의 객체는 아직 참조 가능한 객체 이기 때문에 가비지가 되지 않는다
	}
}
