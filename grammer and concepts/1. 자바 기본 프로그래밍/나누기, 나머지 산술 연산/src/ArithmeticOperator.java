/*
 * 초단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램
 */

import java.util.Scanner;

// ArithmeticOperator 클래스
public class ArithmeticOperator {
	
	// main 메소드
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in); // Scanner 객체 sc
		
		int time = sc.nextInt(); // 입력받은 시간
		int second = time % 60; // 60(1분)으로 나눈 나머지가 초
		int minute = (time / 60) % 60; // 60(1분)으로 나눠 분으로 만들고 60(1시간)으로 나눴을 때 나머지가 분
		int hour = (time / 60) / 60; // 60(1분)으로 나눠 분으로 만들고 60(1시간)으로 나눴을 때 몫이 분
		
		System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");
		sc.close(); //Scanner 객체 사용 종료
	}
	
}
