/*
 * 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class ArrayAccess {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요");
		int array[] = new int[5]; //5개 크기의 배열
		int biggestNum = 0; //가장 큰 수를 저장하는 변수
		
		for (int i = 0; i < 5; i++) { //5번 반복
			array[i] = sc.nextInt(); //정수를 입력받는다
		
			if (biggestNum < array[i]) //i번째 array의 원소가 biggestNum보다 큰 값이면 biggestNum 값이 된다
				biggestNum = array[i];
		}
		
		System.out.println("가장 큰 수는 " + biggestNum + "입니다");
		
		sc.close();
	}
}
