
public class Point {
	private int x;
	private int y;
	
	public Point (int x, int y) { //x, y를 초기화 하는 생성자
		this.x = x;
		this.y = y;
	}
	
	public String toString() { //toString 오버라이딩
		return "(" + x + ", " + y + ")";
	}
}
