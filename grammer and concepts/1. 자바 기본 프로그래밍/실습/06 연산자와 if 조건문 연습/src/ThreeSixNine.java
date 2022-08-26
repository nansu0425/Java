/*
 * 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는
 * "박수짝짝"을 출력하는 프로그램을 작성하라. 
 */

import java.util.Scanner;

public class ThreeSixNine {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("1~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt(); //정수를 입력받는다
		
		int units = num%10; //num의 일의 자리 수
		int tens = num/10; //num의 십의 자리 수
		
		//일의 자리, 십의 자리 모두 3,6,9가 있는 경우
		if (((units == 3) || (units == 6) || (units == 9)) && ((tens == 3) || (tens == 6) || (tens == 9))) 
			System.out.println("박수짝짝");
		//일의 자리 또는 십의 자리에 3,6,9가 있는 경우
		else if (((units == 3) || (units == 6) || (units == 9)) || ((tens == 3) || (tens == 6) || (tens == 9)))
			System.out.println("박수짝");
		
		sc.close();
	}
}
