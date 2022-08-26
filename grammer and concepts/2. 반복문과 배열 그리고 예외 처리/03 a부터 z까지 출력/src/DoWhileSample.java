/*
 * do-while 문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하라.
 */

public class DoWhileSample {
	public static void main (String[] args) {
		char alphabet = 'a'; //출력할 알파벳을 저장
		
		do {
			System.out.print(alphabet); //알파벳 출력
			alphabet++; //다음 알파벳으로 넘어가기
		} while (alphabet <= 'z'); //알파벳이 z이하이면 반복
	}
}
