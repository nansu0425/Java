/*
 * for문을 이용하여 1에서 10까지 덧셈으로 표시하고 합을 출력하라.
 */

public class ForSample {
	public static void main (String[] args) {
		int sum = 0; //수의 합을 저장하는 변수
		
		for (int i = 1; i <= 10; i++) { //i가 1부터 10이 될 때까지 반복
			sum += i; //sum에 증가되는 i를 더한다
			
			if (i != 10) //i가 10이 아니면
				System.out.printf("%d+", i); //i의 값과 +를 출력
			else //i가 10이면
				System.out.printf("%d", i); //i의 값만 출력
		}
		
		System.out.println("="+sum); //=과 sum값 출력
	}
}
