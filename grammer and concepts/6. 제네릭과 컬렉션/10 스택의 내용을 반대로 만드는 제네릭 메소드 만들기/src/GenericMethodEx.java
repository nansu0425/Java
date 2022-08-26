/*
 * 07의 GStack을 이용하여 매개변수로 주어진 스택의 내용을 반대로 만드는 제네릭 메소드 reverse()를 작성하라
 */

public class GenericMethodEx {
	public static <T> GStack<T> reverse(GStack<T> stack) {
		GStack<T> reverseStack = new GStack<T>(); //인자의 스택을 거꾸로 바꾸고 저장할 스택
		
		while (true) { //스택을 거꾸로 변경
			T item = stack.pop(); //스택에서 item을 하나 꺼냄
			
			if (item == null) //item이 비어있으면 반복문 탈출
				break;
			
			reverseStack.push(item); //pop한 item을 reverseStack에 push
		}
		
		return reverseStack;
	}
	
	public static void main (String[] args) {
		GStack<Double> stack = new GStack<Double>(); //doouble 타입 stack
		
		for (int i = 0; i < 5; i++) //5개의 요소를 push 
			stack.push(Double.valueOf(i));
		
		stack = reverse(stack); //스택을 거꾸로 바꾼다
		for (int i = 0; i < 5; i++) //스택 출력
			System.out.println(stack.pop());
	}
}
