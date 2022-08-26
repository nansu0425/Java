/*
 * 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
 * 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
 */

import java.util.Scanner;

public class PointInCircle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("원의 중심과 반지름 입력>>");
		int cirx = sc.nextInt(); //원 중심의 x 좌표
		int ciry = sc.nextInt(); //원 중심의 y 좌표
		double radius = sc.nextDouble(); //원의 반지름
		
		System.out.printf("점 입력>>");
		int x = sc.nextInt(); //임의의 점 x
		int y = sc.nextInt(); //임의의 점 ys
		
		//임의의 점과 원 중심과의 거리
		double distance = Math.sqrt((cirx - x)*(cirx - x) + (ciry - y)*(ciry - y));
		
		if (distance <= radius) //거리가 반지름보다 작을 때
			System.out.println("점 (" + x + ", " + y + ")은 원 안에 있다");
		else //거리가 반지름보다 클 때
			System.out.println("점 (" + x + ", " + y + ")은 원 밖에 있다");
		
		sc.close();
	}
}
