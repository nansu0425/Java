/*
 * Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라
 */

public class EqualsEx {
	public static void main (String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(5, 5);
		
		if (p1.equals(p2)) //p1, p2의 좌표를 비교
			System.out.println("p1과 p2는 같습니다");
		else
			System.out.println("p1과 p2는 다릅니다");
		
		if (p1.equals(p3)) //p1, p3의 좌표를 비교
			System.out.println("p1과 p3는 같습니다");
		else
			System.out.println("p1과 p3는 다릅니다");
	}
}
