/*
 * 두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램 코드이다. 사용자가 나누는 수에 0을 입력하면 ArithmeticException 예외가
 * 발생하여 프로그램이 강제 종료된다.
 */

import java.util.Scanner;

public class DivideByZero {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나뉨수를 입력하시오 : ");
		int numerator = sc.nextInt(); //분자를 정수로 입력받는다
		
		System.out.print("나눗수를 입력하시오 : ");
		int denominator = sc.nextInt(); //분모를 정수로 입력받는다
		
		int quotient = numerator/denominator; //몫을 구한다
		System.out.println("몫은 " + quotient);
		
		sc.close();
	}
}
