/*
 * static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기를 만들어보자
 */

import java.util.Scanner;

public class StaticMember {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환율(1달러)>> ");
		CurrencyConverter.setRate(sc.nextDouble()); //1달러 환율을 입력
		
		System.out.println("백만원은 $" + CurrencyConverter.wonToDollar(1000000) + "입니다"); //백만원의 달러 환율 출력
		System.out.println("$100는 " + CurrencyConverter.dollarToWon(100) + "원 입니다"); //백달러의 원화 환율 출력
		
		sc.close();
	}
}
