
public class ColorPoint extends Point {
	private String color; //색깔 필드
	
	public ColorPoint(int x, int y, String color) { //좌표와 색깔을 초기화하는 생성자
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() { //색과 좌표 출력
		System.out.print(color);
		showPoint();
	}
}
