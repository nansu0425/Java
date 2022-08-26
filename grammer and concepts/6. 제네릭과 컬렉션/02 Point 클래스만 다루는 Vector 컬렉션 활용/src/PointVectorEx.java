/*
 * 점(x, y)를 표현하는 Point 클래스를 만들고, Point의 객체만 다루는 벡터를 작성하라
 */

import java.util.Vector;

public class PointVectorEx {
	public static void main (String[] args) {
		Vector<Point> v = new Vector<Point>(); //Point 타입을 다루는 Vector
		
		//3개의 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); //1번 요소 삭제
		
		for (Point p : v) //객체의 모든 요소 출력
			System.out.println(p);
	}
}
