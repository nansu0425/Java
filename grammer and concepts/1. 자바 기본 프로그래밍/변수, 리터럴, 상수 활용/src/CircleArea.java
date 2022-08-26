/*
 * 상수 PI를 선언하고 원의 면적을 구하는 프로그램
 */

//CircleArea 클래스
public class CircleArea {
	
	//main() 메소드
	public static void main(String[] args) {
		final double PI = 3.141592; //상수 PI
		float radius = 2.5f; //반지름 
		double area = radius*radius*PI; //원의 면적
		
		System.out.println("원의 면적 : " + area); //원의 면적 출력
	}
	
}
