/*
 * try-catch 블록을 이용하여 예제 3-14를 수정하여, 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고 다시 입력 받는 
 * 프로그램을 작성하라
 */

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나뉨수를 입력하시오 : ");
		int numerator = sc.nextInt(); //분자를 정수를 입력받는다
		
		System.out.print("나눗수를 입력하시오 : ");
		int denominator = sc.nextInt(); //분모를 정수로 입력받는다
		
		while (true) { //break를 만날 때 까지 반복
			try {
				System.out.println("몫은 " + numerator/denominator); //몫을 출력한다
				break; //예외가 없으면 반복문 탈출
			} catch (ArithmeticException e) { //0으로 나눌 경우
				System.out.print("0으로 나눌 수 없습니다! 나눗수를 다시 입력하시오 : ");
				denominator = sc.nextInt(); //분모를 정수로 입력받는다
			}
		}
		
		sc.close();
	}
}
