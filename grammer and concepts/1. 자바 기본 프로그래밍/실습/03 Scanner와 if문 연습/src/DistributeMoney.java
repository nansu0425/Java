/*
 * Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전,
 * 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
 */

import java.util.Scanner;

public class DistributeMoney {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("금액을 입력하시오>>");
		int money = sc.nextInt(); //금액을 입력받는다
		
		if(money > 50000) { //오만원 변환 가능한 경우
			System.out.println("오만원권 " + money/50000 + "매");
			money = money%50000;
		}
		
		if(money > 10000) { //만원 변환 가능한 경우
			System.out.println("만원권 " + money/10000 + "매");
			money = money%10000;
		}
		
		if(money > 1000) { //천원 변환 가능한 경우
			System.out.println("천원권 " + money/1000 + "매");
			money = money%1000;
		}
		
		if(money > 500) { //오백원 변환 가능한 경우
			System.out.println("오백원 " + money/500 + "개");
			money = money%500;
		}
		
		if(money > 100) { //백원 변환 가능한 경우
			System.out.println("백원 " + money/100 + "개");
			money = money%100;
		}
		
		if(money > 50) { //오십원 변환 가능한 경우
			System.out.println("오십원 " + money/50 + "개");
			money = money%50;
		}
		
		if(money > 10) { //십원 변환 가능한 경우
			System.out.println("십원 " + money/10 + "개");
			money = money%10;
		}
		
		if(money > 1) { //일원 변환 가능한 경우
			System.out.println("일원 " + money/1 + "개");
			money = money%1;
		}
		
		sc.close();
	}
}
