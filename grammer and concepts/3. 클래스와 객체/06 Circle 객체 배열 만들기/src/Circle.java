/*
 * 반지름인 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력하라
 */

public class Circle {
	int radius; //반지름 필드
	
	public Circle(int radius) { //반지름을 초기화 시키는 생성자
		this.radius = radius;
	}
	
	public double getArea() { //원의 면적을 반환하는 메소드
		return radius*radius*3.141592;
	}
	
	public static void main (String[] args) {
		Circle[] c = new Circle[5]; //원소 5개를 갖는 Circle 배열
		
		for (int i = 0; i < c.length; i++) { //c 배열의 객체를 생성하고 원의 면적을 출력
			c[i] = new Circle(i);
			System.out.println(i + "번 째 원소의 원 면적은 " + (int) c[i].getArea() + "입니다");
		}
	}
}
