/*
 * 스택 자료 구조를 제네릭 클래스로 선언하고, String과 Integer 스택을 각각 사용하는 예를 보여라
 */

public class MyStack {
	public static void main (String[] args) {
		GStack<String> stringST = new GStack<String>(); //string 타입 스택
		
		//스택에 값 push
		stringST.push("seoul");
		stringST.push("busan");
		stringST.push("LA");
		
		for (int i = 0; i < 3; i++) //스택 요소 출력
			System.out.println(stringST.pop());
		
		GStack<Integer> integerST = new GStack<Integer>(); //integer 타입 스택
		
		//스택에 값 push
		integerST.push(1);
		integerST.push(3);
		integerST.push(5);
		
		for (int i = 0; i < 3; i++) 
			System.out.println(integerST.pop());
	}
}
