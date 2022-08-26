/*
 * 입력된 수가 3의 배수인지 판별하는 프로그램
 */

import java.util.Scanner;

public class MultipleOfThree {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("수를 입력하시오 : ");
		int num = sc.nextInt(); //수를 입력
		
		if (num%3 == 0) 
			System.out.println("3의 배수입니다. "); //num이 3의 배수인 경우
		else 
			System.out.println("3의 배수가 아닙니다. "); //num이 3의 배수가 아닌 경우
		
		sc.close();
	}
	
}
