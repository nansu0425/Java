/*
 * switch문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램
 */

import java.util.Scanner;

public class GradingSwitch {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt(); //점수를 입력받고 저장
		char grade; //조건에 따라 학점을 저장
		
		switch (score/10) { //점수를 10으로 나눠 몫을 조건으로 사용 
		case 10 : //100점인 경우
			grade = 'A';
			break;
		case 9 : //90점대인 경우
			grade = 'A';
			break;
		case 8 : //80점대인 경우
			grade = 'B';
			break;
		case 7 : //70점대인 경우
			grade = 'C';
			break;
		case 6 : //60점대인 경우
			grade = 'D';
			break;
		default : //60점 미만인 경우
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다");
		
		sc.close();
	}
	
}
