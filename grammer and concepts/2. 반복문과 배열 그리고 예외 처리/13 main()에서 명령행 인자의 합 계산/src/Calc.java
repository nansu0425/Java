/*
 * 사용자가 명령행에 입력한 실수들을 main() 메소드에서 전달받아 합을 구하는 프로그램을 작성하라.
 */

public class Calc {
	public static void main (String[] args) {
		double sum = 0; //합을 저장
		
		for (String i : args) //args배열의 원소를 순차적으로 i에 대입
			sum += Double.parseDouble(i); //문자열을 double형으로 형변환 하여 sum에 더한다
		
		System.out.println("sum = " + sum);
	}
}
