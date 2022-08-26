/*
 * 시험점수가 80점 이상이라면 합격 판별을 하는 프로그램
 */

import java.util.Scanner;

public class SuccessOrFail {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 클래스 객체
		
		System.out.printf("점수를 입력하시오 : ");
		int grade = sc.nextInt(); //점수를 입력받는다
		
		if (grade >= 80) 
			System.out.println("축하합니다! 합격입니다. "); //점수가 80점 이상인 경우
		
		sc.close(); //Scanner 클래스 사용 종료
	}
	
}
