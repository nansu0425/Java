/*
 * Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 
 * 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
 */

import java.util.Scanner;

public class TriangleExistance {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("정수 3개를 입력하시오>>");
		int num1 = sc.nextInt(); //첫번째 수
		int num2 = sc.nextInt(); //두번째 수
		int num3 = sc.nextInt(); //세번째 수
		
		// 두 변의 합보다 한 변의 길이가 더 큰 경우가 있으면 삼각형을 만들 수 없다
		if (((num1 + num2) > num3) && ((num2 + num3) > num1) && ((num1 + num3) > num2))
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");
		
		sc.close();
	}
}
