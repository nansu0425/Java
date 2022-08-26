/*
 * 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 두 개의 원을 입력받고 두 원이 서로 겹치는지
 * 판단하여 출력하라.
 */

import java.util.Scanner;

public class CircleOverlap {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 원의 중심과 반지름 입력>>");
		int x1 = sc.nextInt(); //첫번째 원의 x
		int y1 = sc.nextInt(); //첫번째 원의 y
		int radius1 = sc.nextInt(); //첫번째 원의 반지름
		
		System.out.printf("두번째 원의 중심과 반지름 입력>>");
		int x2 = sc.nextInt(); //두번째 원의 x
		int y2 = sc.nextInt(); //두번째 원의 y
		int radius2 = sc.nextInt(); //두번째 원의 반지름 
		
		// 두 원의 중심 사이 거리
		double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		
		if ((radius1 + radius2) >= distance) //반지름의 합보다 중심 사이의 거리가 짧거나 같으면 겹친다
			System.out.println("두 원은 서로 겹친다");
		else //반지름의 합이 중심 사이의 거리보다 작으면 겹치지 않는다
			System.out.println("두 원은 서로 겹치지 않는다");
		
		sc.close();
	}
}
