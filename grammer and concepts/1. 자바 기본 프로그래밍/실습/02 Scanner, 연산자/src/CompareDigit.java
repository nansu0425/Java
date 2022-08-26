/*
 * Scanner 클래스를 이용하여 2자리 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라. 
 */

import java.util.Scanner;

public class CompareDigit {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("2자리수 정수 입력(10~99)>>");
		int num = sc.nextInt(); //2자리수 정수를 입력받는다
		
		int tenDigit = num/10; //십의 자리 수
		int unitDigit = num%10; //일의 자리 수
		
		System.out.println((tenDigit == unitDigit) ? "Yes! 10의 자리와 1의 자리가 같습니다" : "NO! 10의 자리와 1의 자리가 다릅니다");
	}
}
