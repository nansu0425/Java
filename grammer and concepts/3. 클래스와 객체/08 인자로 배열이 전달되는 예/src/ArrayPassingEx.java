/*
 * char[] 배열을 전달받아 출력하는 printCharArray() 메소드와 배열 속의 공백(' ') 문자를 ','로 대치하는 replaceSpace() 메소드를 작성하라
 */

public class ArrayPassingEx {
	public static void printCharArray(char[] charArray) { //매개변수로 받은 문자 배열을 출력
		for (int i = 0; i < charArray.length; i++) 
			System.out.print(charArray[i]);
		
		System.out.println(); 
	}
	
	public static void replaceSpace(char[] charArray) { //매개변수로 받은 문자 배열의 공백 문자를 ,로 대치
		for (int i = 0; i < charArray.length; i++) { 
			if (charArray[i] == ' ')
				charArray[i] = ',';
		}
	}
	
	public static void main (String[] args) {
		char[] charArray = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		printCharArray(charArray); //배열 출력
		replaceSpace(charArray); //공백을 ,로 대치
		printCharArray(charArray); //수정된 배열 출력
	}
}
