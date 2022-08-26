/*
 * 5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라.
 * 입력된 수가 0이나 음수이면 continue 문을 이용하여 합하지 않고 다음 반복으로 넘어간다.
 */

import java.util.Scanner;

public class ContinueExample {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int sum = 0; //정수의 합을 저장
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt(); //정수를 입력받는다
			
			if (num <= 0) //입력된 정수가 0 또는 음수이면 continue
				continue;
			else //양수이면 sum에 num을 더한다
				sum += num;
		}
		
		System.out.println("양수의 합은 " + sum);
		
		sc.close();
	}
}
