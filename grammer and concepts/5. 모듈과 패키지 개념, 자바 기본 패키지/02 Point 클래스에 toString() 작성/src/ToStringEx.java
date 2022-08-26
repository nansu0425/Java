/*
 * Point 클래스에 Point 객체를 문자열로 리턴하는 toString() 메소드를 작성하라
 */

public class ToStringEx {
	public static void main (String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p); //객체를 출력할 때 toString() 자동으로 호출
		System.out.println(p + "입니다");
	}
}
