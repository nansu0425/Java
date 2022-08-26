public interface DataCollection<E> extends Iterable<E> {
	// DynamicArray 구현에 필요한 메소드
	void put(E e);
	void insert(int index, E e);
	void remove(int index);
	E elemAt(int index);
	int length();
	void clear();
}
