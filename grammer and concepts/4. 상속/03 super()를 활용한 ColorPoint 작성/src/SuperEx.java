/*
 * super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하라
 */

public class SuperEx {
	public static void main (String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue"); //ColorPoint 객체 생성
		cp.showColorPoint(); //색과 좌표 정보 출력
	}
}
