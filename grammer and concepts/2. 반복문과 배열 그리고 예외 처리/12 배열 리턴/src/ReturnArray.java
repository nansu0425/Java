/*
 * 정수 4개를 가지는 일차원 배열을 생성하고 1,2,3,4로 초기화한 다음, 배열을 리턴하는 makeArray()를 작성하고, 
 * 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램을 작성하라.
 */

public class ReturnArray {
	static int[] makeArray () { //1,2,3,4를 원소로 갖는 크기 4의 배열 리턴
		int tmp[] = new int[4]; //크기가 4인 배열 선언
		
		for (int i = 0; i < tmp.length; i++) //tmp 원소를 1,2,3,4로 초기화 
			tmp[i] = i + 1;
		
		return tmp; //tmp 반환
	}
	
	public static void main (String[] args) {
		int array[] = makeArray(); //array에 makeArray가 반환하는 배열을 대입
		
		for (int i : array) //array의 원소 값을 출력
			System.out.print(i + " ");
	}
}
