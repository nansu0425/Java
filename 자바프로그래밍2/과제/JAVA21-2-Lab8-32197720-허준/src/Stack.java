
public class Stack<E> implements List<E> {
	DynamicArray<E> dArr = new DynamicArray<>();
	
	@Override
	public DynamicArray<E> getDynamiArray() {
		return this.dArr;
	}
	
	// 원소 push
	public void push(E e) {
		this.dArr.put(e);
	}
	
	// 원소 pop
	public void pop() {
		this.dArr.remove(dArr.length()-1);
	}
}
