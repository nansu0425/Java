/*
 * 2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램을 작성하라.
 * 한 줄에 한 단씩 출력한다.
 */

public class NestedLoop {
	public static void main (String[] args) {
		
		for (int i = 1; i <= 9; i++) { //1단부터 9단까지
			for (int j = 1; j <= 9; j++) { //각 단의 구구단 출력
				System.out.print(i + "*" + j + "=" + i*j); //구구단 출력
				System.out.print('\t'); //탭으로 구분
			}
			
			System.out.println(); //줄바꿈
		}
	}
}
