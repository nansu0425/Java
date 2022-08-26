/*
 * "exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램을 작성하라.
 */

import java.util.Scanner;

public class BreakExample {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다");
		
		while (true) { //조건 없이 반복
			System.out.print(">>");
			String exit = sc.nextLine(); //문자열 한 line을 입력받는다
			
			if (exit.equals("exit")) //exit이 입력되면 반복문 탈출
				break;
		}
		
		System.out.println("종료합니다");
		
		sc.close();
	}
}
