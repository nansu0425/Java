
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) { //x, y를 초기화하는 생성자
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point) obj; //객체 obj를 Point 타입으로 다운 캐스팅
		
		if ((x == p.x) && (y == p.y)) //현재 객체의 좌표와 매개변수로 받은 객체의 좌표가 같으면 true
			return true;
		else //좌표가 다르면 false
			return false;
	}
}
