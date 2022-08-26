/*
 * Math 클래스의 다양한 메소드 활용 예를 살펴보자
 */

public class MathEx {
	public static void main (String[] args) {
		System.out.println(Math.PI); //상수 값 PI
		System.out.println(Math.ceil(4.2)); //4.2 올림
		System.out.println(Math.floor(5.8)); //5.8 내림
		System.out.println(Math.sqrt(4)); //4 제곱근
		System.out.println(Math.exp(2)); //e의 2승
		System.out.println(Math.round(3.26)); //반올림
		
		//[1, 45] 사이의 정수형 난수 5개 발생
		System.out.println("이번주 행운의 번호는 ");
		for (int i = 0; i < 5; i++) 
			System.out.print((int)(Math.random()*45 + 1) + " ");  //random()메소드는 0.0부터 1.0보다 작은 실수 중 무작위로 반환
	}
}
