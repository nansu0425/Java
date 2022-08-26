/*
 * Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
 * 평균값이 아님에 중의하라.
 */

import java.util.Scanner;

public class MidNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력>>");
		int first = sc.nextInt(); //첫번 째 수
		int second = sc.nextInt(); //두번 째 수
		int third = sc.nextInt(); //세번 째 수
		
		int tmp; //mid값인지 확인할 때 사용
		int mid = 0; //중간 값을 저장
		boolean midExist = false; //중간 값이 존재하면 true
		
		tmp = first; //첫번 째 수가 mid인지 확인
		if (((tmp < second) && (tmp > third)) || ((tmp > second) && (tmp < third))) {
			mid = tmp;
			midExist = true;
		}
		
		tmp = second; //두번 째 수가 mid인지 확인
		if (((tmp < first) && (tmp > third)) || ((tmp > first) && (tmp < third))) {
			mid = tmp;
			midExist = true;
		}
		
		tmp = third; //세번 째 수가 mid인지 확인
		if (((tmp < first) && (tmp > second)) || ((tmp > first) && (tmp < second))) {
			mid = tmp;
			midExist = true;
		}
		
		if (midExist) //중간 값이 존재하면 mid출력
			System.out.println("중간 값은 " + mid);
		else
			System.out.println("중간 값은 없습니다");
		
		sc.close();
	}
}
