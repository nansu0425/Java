/*
 * (x, y)의 한 점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는 ColorPoint 클래스를 만들고 활용해보자
 */

public class ColorPointEx {
	public static void main (String[] args) {
		Point p = new Point(); //Point 객체 생성
		p.set(1, 2); //좌표 설정
		p.showPoint(); //좌표 출력
		
		ColorPoint cp = new ColorPoint(); //ColorPoint 객체 생성
		cp.set(3, 4); //좌표 설정
		cp.setColor("red"); //색 설정
		cp.showColorPoint(); //색과 좌표 출력
	}
}
