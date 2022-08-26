/*
 * 문자열을 정수로 변환할 때 발생하는 NumberFormatException을 처리하는 프로그램을 작성하라
 */

public class NumException {
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for (i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]); //i번째 stringNumber 원소를 전수로 변환
				System.out.println("정수로 변환된 값은 " + j);
			}
		} catch (NumberFormatException e) { //정수로 변환할 수 없는 값일 때
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다");
		}
	}
}
