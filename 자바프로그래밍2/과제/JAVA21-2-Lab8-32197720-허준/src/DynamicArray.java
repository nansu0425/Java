import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray<E> implements DataCollection<E> {
	private int length; // 배열의 원소 개수
	private int capacity; // 배열의 크기
	private E[] data; // 배열
	
	// 생성자
	public DynamicArray() {
		super();
		this.length = 0;
		this.capacity = 0;
		this.data = (E[]) new Object[capacity];
	}
	
	// 원소 추가
	@Override
	public void put(E e) {
		if (length == capacity) { // 배열에 자리가 없는 경우
			capacity++;
			Object[] tmpArray = new Object[capacity];
			tmpArray = dataToTmpArray(tmpArray);
			tmpArray[capacity-1] = e;
			this.data = (E[]) tmpArray;
			length++;
		} else if (length < capacity) { // 배열에 자리가 있는 경우
			data[length] = e;
			length++;
		} else { // 배열 크기보다 개수가 많은 경우
			System.out.println("배열 크기 초과");
		}
	}
	
	// tmpArray에 data를 복사
	public Object[] dataToTmpArray(Object[] tmpArray) {
		for (int i = 0; i < length; i++) {
			tmpArray[i] = data[i];
		}
		
		return tmpArray;
	}
	
	// 원하는 index에 원소 삽입
	@Override
	public void insert(int index, E e) {
		Object[] tmpArray = new Object[capacity];
		tmpArray = dataToTmpArray(tmpArray);
		int tmpLength = this.length;
		
		this.data = (E[]) new Object[capacity]; // data를 capacity는 유지한채 초기화
		this.length = 0;
		
		boolean isInsert = false;
		for (int i = 0; i < tmpLength;) {
			if (!isInsert && (i == index)) { // index에 원소 삽입
				put(e);
				isInsert = true;
				continue;
			}
			
			put((E) tmpArray[i]); // i 번째 자리의 원소를 data에 대입
			i++;
		}
	}
	
	// index의 원소를 삭제
	@Override
	public void remove(int index) {
		Object[] tmpArray = new Object[capacity];
		tmpArray = dataToTmpArray(tmpArray);
		int tmpLength = this.length;
		
		this.data = (E[]) new Object[capacity];
		this.length = 0;
		
		for (int i = 0; i < tmpLength;) {
			if (i == index) { // i가 index면 put 하지 않는다
				i++;
				continue;
			}
			
			put((E) tmpArray[i]); // i 번째 자리의 원소를 data에 대입
			i++;
		}
	}
	
	// index의 원소를 반환
	@Override
	public E elemAt(int index) {
		return this.data[index];
	}
	
	// length 값 반환
	@Override
	public int length() {
		return this.length;
	}
	
	// 배열 초기화
	@Override
	public void clear() {
		this.length = 0;
		this.capacity = 3;
		this.data = (E[]) new Object[capacity];
	}
	
	// 내부 iterator 구현 class
	private class DynamicArrayIterator<E> implements Iterator<E> {
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			return index < length;
		}
		
		@Override
		public E next() {
			if (!hasNext()) {
				throw new NoSuchElementException(); 
			}
			return (E) elemAt(index++);
		}
		
		@Override
		public void remove() {
			DynamicArray.this.remove(--index);
		}
	}
	
	// iterator 반환
	@Override
	public Iterator<E> iterator() {
		return new DynamicArrayIterator<E>();
	}
}
