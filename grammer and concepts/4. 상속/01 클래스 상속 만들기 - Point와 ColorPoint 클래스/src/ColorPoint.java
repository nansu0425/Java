public class ColorPoint extends Point {
	private String color; //색 필드
	
	public void setColor(String color) { //색 설정 메소드
		this.color = color;
	}
	
	public void showColorPoint() { //색과 좌표 정보 출력
		System.out.print(color);
		showPoint();
	}
}
