
public class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) { //너비, 높이를 초기화하는 생성자
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) { //두 사각형의 넓이가 같은지를 판단하는 메소드
		Rect r = (Rect) obj; //객체 obj를 Rect로 다운캐스팅
		
		if ((getArea(width, height) == getArea(r.width, r.height))) //현재 객체와 매개변수로 받은 객체의 면적이 같으면 true, 아니면 false를 반환
			return true;
		else
			return false;
	}
	
	public int getArea(int width, int height) { //면적을 반환하는 메소드
		return width*height;
	}
}
