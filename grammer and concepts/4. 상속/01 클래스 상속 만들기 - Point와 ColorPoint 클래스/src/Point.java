public class Point { 
	private int x; //x 좌표 필드
	private int y; //y 좌표 필드
	
	public void set(int x, int y) { //좌표 설정 메소드
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() { //좌표 출력 메소드
		System.out.println("(" + x + ", " + y + ")");
	}
}
