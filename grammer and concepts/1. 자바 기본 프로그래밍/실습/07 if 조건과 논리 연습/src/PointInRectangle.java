/*
 * 2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다. 
 * (100, 100)과 (200, 200)의 두 점으로 이루어진 직사각형이 있을 때, Scanner를 이용하여 정수 x와 y 값을 입력받고 점 (x, y)가
 * 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class PointInRectangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점 (x, y)의 좌표를 입력하시오>>");
		int x = sc.nextInt(); //x의 좌표
		int y = sc.nextInt(); //y의 좌표
		
		//(100, 100)과 (200, 200)으로 이루어진 사각형 안에 점이 있는 경우
		if ((x > 100) && (x < 200) && (y > 100) && (y < 200)) 
			System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다");
		//(100, 100)과 (200, 200)으로 이루어진 사각형 밖에 점이 있는 경우
		else 
			System.out.println("(" + x + ", " + y + ")는 사각형 밖에 있습니다");
		
		sc.close();
	}
}
