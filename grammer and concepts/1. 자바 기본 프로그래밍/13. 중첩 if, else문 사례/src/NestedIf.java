/*
 * 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력하고 4학년의 경우 70점 이상이어야 합격인 프로그램
 */

import java.util.Scanner;

public class NestedIf {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt(); // 입력받은 점수 값 변수
		System.out.printf("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt(); // 입력받은 학년 값 변수
		
		if (score >= 60) { // 60점 이상인 경우
			if (grade != 4) // 4학년이 아닌 경우 합격
				System.out.println("합격!");
			else if (score >= 70) // 4학년이고 70점 이상이면 합격
				System.out.println("합격!");
			else // 4학년이 70점 미만이면 불합격
				System.out.println("불합격!");
		} 
		else // 60점 미만인 경우 불합격
			System.out.println("불합격!");
		
		sc.close();
	}
	
}
