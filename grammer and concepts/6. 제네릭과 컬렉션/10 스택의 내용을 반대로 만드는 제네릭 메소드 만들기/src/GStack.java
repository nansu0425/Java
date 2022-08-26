
public class GStack<T> {
	int tos; //스택 포인터
	Object[] stack; //스택에 요소를 저장할 공간 배열, 제네릭 타입 객체 생성은 불가능하므로 Object 타입 사용
	
	public GStack() {
		tos = 0;
		stack = new Object[10]; //스택 생성시 크기는 10
	}
	
	public void push(T item) {
		if (tos == 10) //스택이 가득 찬 경우
			return;
		stack[tos] = item; //superclass type에 대입하는 업캐스팅
		tos++;
	}
	
	public T pop() {
		if (tos == 0) //스택에 아무것도 없는 경우
			return null;
		tos--; 
		return (T)stack[tos]; //subclass type으로 반환하는 다운 캐스팅
	}
}
