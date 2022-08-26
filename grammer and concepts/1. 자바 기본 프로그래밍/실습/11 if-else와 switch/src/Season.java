/*
 * 숫자를 입려받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12,1,2의 경우 "겨울"을, 그 외 숫자를 입력한 경우 "잘못입력"을
 * 출력하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class Season {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("달을 입력하세요(1~12)>>");
		int month = sc.nextInt();
		
		// if-else 문을 사용했을 때
		if ((month >= 3) && (month <= 5)) //3~5는 "봄"
			System.out.println("봄");
		else if ((month >= 6) && (month <= 8)) //6~8은 "여름"
			System.out.println("여름");
		else if ((month >= 9) && (month <= 11)) //9~11은 "가을"
			System.out.println("가을");
		else if ((month == 12) || (month == 1) || (month == 2)) //12,1,2의 경우 "겨울"
			System.out.println("겨울");
		else //그 외 숫자를 입력한 경우 "잘못입력"
			System.out.println("잘못입력");
		
		// switch 문을 사용했을 때
		String season = ""; //계절을 문자열로 저장
		boolean error = false; //잘 못 입력했을 때 true
		
		switch (month) {
		//3~5는 "봄"
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		//6~8은 "여름"	
		case 6 : case 7 : case 8 :
			season = "여름";
			break;
		//9~11은 "가을"
		case 9 : case 10 : case 11 :
			season = "가을";
			break;
		//12,1,2의 경우 "겨울"
		case 12 : case 1 : case 2 :
			season = "겨울";
			break;
		//그 외 숫자를 입력한 경우 error가 true
		default :
			error = true;
		}
		System.out.println(error ? "잘못입력" : season);  //error가 false인 경우 계절 출력
		
		sc.close();
	}
}
