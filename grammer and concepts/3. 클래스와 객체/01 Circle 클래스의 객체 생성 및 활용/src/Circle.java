/*
 * 반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라. 그리고 객체가 생성된 모습을 그려보라.
 */

public class Circle {
	double radius; //반지름 필드
	String name; //이름 필드
	
	public Circle() { //생성자
	}
	
	public double getArea() { //원의 넓이를 구하는 메소드
		return radius*radius*3.141592;
	}
	
	public static void main (String[] args) {
		Circle javaPizza = new Circle(); //Circle클래스의 javaPizza객체 생성
		//필드 초기화
		javaPizza.name = "자바피자";
		javaPizza.radius = 53.6;
		
		Circle javaDonut = new Circle(); //Circle클래스의 javaDonut객체 생성
		//필드 초기화
		javaDonut.name = "자바도넛";
		javaDonut.radius = 46.3;
		
		System.out.println(javaPizza.name + "의 면적은 " + javaPizza.getArea());
		System.out.println(javaDonut.name + "의 면적은 " + javaDonut.getArea());
	}
}
