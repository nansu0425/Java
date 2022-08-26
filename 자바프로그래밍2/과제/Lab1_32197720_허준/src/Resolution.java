//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class Resolution { //resolution data를 다룬다
	private int widthPixels; //가로 픽셀 개수
	private int heightPixels; //세로 픽셀 개수
	
	public Resolution(int widthPixels, int heightPixels) { //생성자
		this.widthPixels = widthPixels;
		this.heightPixels = heightPixels;
	}
	
	public Resolution getResolution() { //현재 객체의 resolution 정보를 가진 객체 반환
		Resolution resolution = new Resolution(this.widthPixels, this.heightPixels);
		return resolution;
	}
	
	@Override
	public String toString() { //toString 메소드 오버라이딩
		return this.widthPixels + "x" + this.heightPixels;
	}
	
	@Override
	public boolean equals(Object o) { //equals 메소드 오버라이딩
		Resolution r = (Resolution) o; //Object type 객체를 down casting
		
		if ((this.widthPixels == r.getWidthPixels()) && (this.heightPixels == r.getHeightPixels())) //인자로 받은 픽셀 개수와 현재 객체의 픽셀 개수가 일치하면 true 반환
			return true;
		else 
			return false;
	}

	public int getWidthPixels() { //widthPixels 값을 get
		return this.widthPixels;
	}

	public int getHeightPixels() { //heightPixels 값을 get
		return this.heightPixels;
	}
}
