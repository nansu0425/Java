/*
 * 2개의 생성자를 가진 Circle 클래스이다. 
 */

public class Circle {
	int radius; //반지름 필드
	String name; //이름 필드
	
	public Circle() { //매개변수 없는 생성자
		radius = 1; name = "";
	}
	
	public Circle(int r, String n) { //반지름과 이름을 매개변수로 받는 생성자
		radius = r; name = n;
	}
	
	public double getArea() { //원 면적을 반환하는 메소드
		return radius*radius*3.141592;
	}
	
	public static void main (String[] args) {
		double area; //원의 면적 저장
		
		Circle pizza = new Circle(10, "자바피자"); //pizza 객체 생성
		area = pizza.getArea(); //area에 자바피자의 넓이 저장
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //donut 객체 생성
		donut.name = "자바도넛"; //donut의 이름을 자바도넛으로 초기화
		area = donut.getArea(); //area에 자바도넛의 넓이 저장
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
