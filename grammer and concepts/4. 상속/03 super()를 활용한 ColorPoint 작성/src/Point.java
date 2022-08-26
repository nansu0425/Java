
public class Point {
	private int x; //x좌표 필드
	private int y; //y좌표 필드
	
	public Point(int x, int y) { //좌표를 초기화는 생성자
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() { //좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
}
