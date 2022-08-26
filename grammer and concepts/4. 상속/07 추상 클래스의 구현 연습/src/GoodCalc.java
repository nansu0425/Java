/*
 * 추상 클래스 Calculator를 상속받은 GoodCalc 클래스를 구현하라
 */

public class GoodCalc extends Calculator { //덧셈 메소드 오버라이딩
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) { //뺄셈 메소드 오버라이딩
		return a - b;
	}
	
	public double average(int[] a) { //평균 메소드 오버라이딩
		int sum = 0; 
		
		for (int i : a) //원소의 합을 구한다
			sum += i;
		
		return sum/a.length; //평균 반환
	}
	
	public static void main (String[] args) {
		Calculator c = new GoodCalc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4}));
	}
}
