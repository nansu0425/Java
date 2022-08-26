/*
 * while 문은 반복 횟수를 알지 못하는 경우에 주로 이용된다. while 문을 이용하여 -1이 입력될 때까지 정수를 계속 입력받아
 * 합을 구하고 평균을 출력하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class WhileSample {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.printf("정수를 입력하고 마지막에 -1을 입력하세요>>");
		int count = 0; //sum에 num을 더한 횟수를 count
		double sum = 0; //num의 합을 저장
		
		int num = sc.nextInt(); //정수를 입력받는다
		while (num != -1) { //num이 -1이 아니면 반복
			count++; //한번 count
			sum += num; //sum에 num을 더한다
			num = sc.nextInt(); //정수를 다시 입력받는다
		}
		
		if (count == 0) //정수가 입력되지 않은 경우
			System.out.println("입력된 정수가 없습니다");
		else { //정수가 입력된 경우
			double average = sum/count; //평균을 구한다
			System.out.println("정수의 개수는 " + count + "개이며 평균은 " + average + "입니다");
		}

		sc.close();
	}
}
