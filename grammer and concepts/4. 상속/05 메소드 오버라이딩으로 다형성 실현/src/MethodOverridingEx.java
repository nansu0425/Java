/*
 * Shape의 draw() 메소드를 Line, Circle, Rect 클래스에서 목적에 맞게 오버라이딩하는 다형성의 사례를 보여라
 */

public class MethodOverridingEx {
	public static void paint(Shape shape) { //Shape 타입 객체의 정보를 출력
		shape.print();
	}
	
	public static void main (String[] args) {
		Line line = new Line();
		
		paint(line); //Line에서 print 메소드를 오버라이딩
		paint(new Shape()); //Shape의 print 메소드
		paint(new Line()); //Line에서 print 메소드를 오버라이딩
		paint(new Rect()); //Rect에서 print 메소드를 오버라이딩
		paint(new Circle()); //Circle에서 print 메소드를 오버라이딩
	}
}
