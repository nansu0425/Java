/*
 * 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하라
 * 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를 처리하여 다시 입력받도록 하라
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		
		int[] num = new int[3]; //정수 3개를 위한 배열
		int sum = 0; //정수의 합을 저장
		
		for (int i = 0; i < num.length; i++) { //배열 원소 수 만큼 반복		
			try {
				System.out.print(i+1 + "번째 수>> ");
				num[i] = sc.nextInt(); //i번째 배열의 원소에 정수를 입력
				sum += num[i]; //예외가 없을 경우 sum에 원소를 더한다
			} catch (InputMismatchException e) { //정수가 아닌 값을 입력한 경우
				System.out.println("정수가 아닙니다 다시 입력하세요!");
				sc.nextLine(); //현재 입력 스트림에 남아 있는 토큰을 지운다
				i--; //현재 원소를 다시 입력 해야 하므로 i가 증가하기전 감소
			}
		}
		
		System.out.println("합은 " + sum);
		
		sc.close();
	}
}
