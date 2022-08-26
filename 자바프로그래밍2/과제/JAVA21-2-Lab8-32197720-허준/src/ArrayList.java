
public class ArrayList<E> implements List<E> {
	DynamicArray<E> dArr = new DynamicArray<>();
	
	@Override
	public DynamicArray<E> getDynamiArray() {
		return this.dArr;
	}
	
	// 원소 add
	public void add(E e) {
		this.dArr.put(e);
	}
	
	// 원소 remove
	public void remove(int index) {
		this.dArr.remove(index);
	}
	
}
