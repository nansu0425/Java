/*
 * 다음 코드의 결과는 무엇인가
 */

public class AutoBoxingUnBoxingEx {
	public static void main (String[] args) {
		int n = 10;
		Integer intObject = n; //자동 boxing, Integer.valueOf(n) 생략
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; //자동 unboxing, intObject.intValue() 생략
		System.out.println("m = " + m);
	}
}
