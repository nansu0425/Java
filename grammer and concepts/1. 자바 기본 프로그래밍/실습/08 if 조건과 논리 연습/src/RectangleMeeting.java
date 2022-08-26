/*
 * 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는 두 점 (x1, x2), (y1, y2)를 입력받아
 * (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class RectangleMeeting {
	// 점 (x, y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 반환, 없으면 false를 반환
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직사각형을 구성하는 두 점을 입력하세요");
		System.out.printf("첫 번째 점>>");
		int x1 = sc.nextInt(); //첫 번째 점의 x
		int y1 = sc.nextInt(); //첫 번째 점의 y
		System.out.printf("두 번째 점>>");
		int x2 = sc.nextInt(); //두 번째 점의 x
		int y2 = sc.nextInt(); //두 번째 점의 y
		
		// 사용자가 입력한 사각형의 꼭짓점이 (100, 100), (200, 200) 사각형 내부에 존재하면 사각형이 충돌
		if (inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y1, 100, 100, 200, 200) || inRect(x1, y2, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
			System.out.println("직사각형이 충돌합니다");
		// (100, 100), (200, 200) 사각형의 꼭짓점이 사용자가 입력한 사각형 내부에 존재하면 사각형이 충돌
		else if (inRect(100, 100, x1, y1, x2, y2) || inRect(200, 100, x1, y1, x2, y2) || inRect(100, 200, x1, y1, x2, y2) || inRect(200, 200, x1, y1, x2, y2))
			System.out.println("직사각형이 충돌합니다");
		else
			System.out.println("직사각형이 충돌하지 않습니다");
		
		sc.close();
	}
}
