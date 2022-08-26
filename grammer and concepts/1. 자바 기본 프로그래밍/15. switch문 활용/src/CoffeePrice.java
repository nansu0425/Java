/*
 * switch문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램
 * 에스프레소, 카푸치노, 카페라떼는 3500원, 아메리카노는 2000원
 */

import java.util.Scanner;

public class CoffeePrice {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨 커피 드릴까요?");
		String coffee = sc.next(); //커피 메뉴를 입력받고 저장
		int price = 0; //커피의 가격을 저장, default 값은 0
		
		switch (coffee) { //커피 이름이 조건
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" : 
			price = 3500; //에스프레소, 카푸치노, 카페라떼의 경우 3500원
			break;
		case "아메리카노" :
			price = 2000; //아메리카노의 경우 2000원
			break;
		default : //없는 메뉴의 경우
			System.out.println("없는 메뉴 입니다");
		}
		
		if (price != 0) //price가 0이 아닌 경우 커피이름과 가격 출력 
			System.out.println(coffee + "는 " + price + "원입니다");
		
		sc.close();
	}
	
}
