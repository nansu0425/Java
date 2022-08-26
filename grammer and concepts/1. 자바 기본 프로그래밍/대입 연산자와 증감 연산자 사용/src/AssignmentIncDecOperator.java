/*
 * 대입 연산자와 증감 연산자를 활용하는 프로그램
 */

public class AssignmentIncDecOperator {
	
	public static void main (String[] args) {
		int a = 3, b = 3, c = 3;
		// 대입 연산자 사용
		a += 3; // a + 3
		b *= 3; // b*3
		c %= 2; // c % 2
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 3;
		// 증감 연산자 사용
		a = d++; // d값 반환 먼지
		System.out.println("a = " + a + ", d = " + d);
		a = ++d; // d값 연산 먼저
		System.out.println("a = " + a + ", d = " + d);
		a = d--; // d값 반환 먼지
		System.out.println("a = " + a + ", d = " + d);
		a = --d; // d값 연산 먼저
		System.out.println("a = " + a + ", d = " + d);
 	}
	
}
