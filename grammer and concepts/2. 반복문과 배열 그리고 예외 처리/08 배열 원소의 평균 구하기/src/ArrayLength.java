/*
 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class ArrayLength {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 정수를 입력하세요>>");
		int array[] = new int[5]; //정수형 배열 5개
		double sum = 0; //입력받은 정수의 합을 저장
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt(); //정수를 입력받는다
			sum += array[i]; //sum에 i번째 array의 원소 값을 더한다
		}
		
		System.out.println("평균은 " + sum/array.length);
	}
}
