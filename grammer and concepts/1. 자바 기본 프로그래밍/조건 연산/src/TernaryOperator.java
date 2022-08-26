/*
 * 조건 연산자를 사용한 프로그램
 */

public class TernaryOperator {
	
	public static void main (String[] args) {
		int a = 3, b = 5;
		
		System.out.println("두 수의 차는 " + (a > b ? a - b : b - a)); //a가 b보다 크면 a - b, a가 b보다 작으면 b - a
	}
	
}
