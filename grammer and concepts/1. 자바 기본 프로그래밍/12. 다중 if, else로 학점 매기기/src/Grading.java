/*
 * 다중 if-else문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램
 */

import java.util.Scanner;

public class Grading {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt(); // 점수 입력 값 변수
		char grade; // 학점 변수
		
		if (score >= 90) 
			grade = 'A'; // 90점 이상인 경우 A
		else if (score >= 80)
			grade = 'B'; // 80점 이상인 경우 B
		else if (score >= 70)
			grade = 'C'; // 70점 이상인 경우 D
		else if (score >= 60)
			grade = 'D'; // 60점 이상인 경우 C
		else
			grade = 'F'; // 60점 이상인 경우 F
		System.out.println("학점은 " + grade + "입니다");
		
		sc.close();
	}
	
}
