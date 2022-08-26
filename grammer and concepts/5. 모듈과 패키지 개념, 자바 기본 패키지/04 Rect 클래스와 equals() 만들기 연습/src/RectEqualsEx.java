/*
 * int 타입의 width(너비)와 height(높이) 필드를 가지는 Rect 클래스를 작성하고, 면적이 같으면 두 Rect 객체가 같은 것으로 판별하는 equals()를 작성하라
 * 생성자에게 너비와 높이를 받아 width, height 필드를 초기화해라
 */

public class RectEqualsEx {
	public static void main (String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		
		if (a.equals(b))
			System.out.println("a와 b의 면적은 같습니다");
		if (a.equals(c))
			System.out.println("a와 c의 면적은 같습니다");
		if (b.equals(c))
			System.out.println("b와 c의 면적은 같스비다");
	}
}
