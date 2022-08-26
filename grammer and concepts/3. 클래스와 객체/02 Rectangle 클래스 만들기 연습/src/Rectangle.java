/*
 * 너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램을 작성하라. 너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진
 * Rectangle 클래스를 만들어 활용하라
 */

import java.util.Scanner;

public class Rectangle {
	int width; //너비 필드
	int height; //높이 필드
	
	public Rectangle() { //생성자
	}
	
	public int getArea() { //사각형의 넓이를 구하는 메소드
		return width*height;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle(); //rect 객체 생성
		
		System.out.print(">> ");
		rect.width = sc.nextInt(); //너비 값 입력
		rect.height = sc.nextInt(); //높이 값 입력
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
	}
}
