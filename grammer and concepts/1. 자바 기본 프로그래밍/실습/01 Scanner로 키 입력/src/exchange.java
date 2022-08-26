/*
 * Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 출력하는 프로그램을 작성하라.
 * $1=1100원으로 가정하고 계산하라.
 */

import java.util.Scanner;

public class exchange {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("원화를 입력하세요(단위 원)>> ");
		int won = sc.nextInt(); //원화를 입력받는다
		
		double dollar = won/1100.0; //원화를 달러로 바꾼다
		
		System.out.println(won + "원은 $" + dollar + "입니다");
		
		sc.close();
	}
}