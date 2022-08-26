import java.util.Iterator;

public class ArrayListDataCollectionAdapter<E> implements DataCollection<E> {
	private DynamicArray<E> dArr;
	
	// 생성자
	public ArrayListDataCollectionAdapter(List<E> list) {
		super();
		this.dArr = list.getDynamiArray();		
	}
	
	// 원소 추가
	@Override
	public void put(E e) {
		this.dArr.put(e);
	}
	
	// 원하는 index에 원소 삽입
	@Override
	public void insert(int index, E e) {
		this.dArr.insert(index, e);
	}
	
	// index의 원소를 삭제
	@Override
	public void remove(int index) {
		this.dArr.remove(index);
	}
	
	// index의 원소를 반환
	@Override
	public E elemAt(int index) {
		return this.dArr.elemAt(index);
	}
	
	// length 값 반환
	@Override
	public int length() {
		return this.length();
	}
	
	// 배열 초기화
	@Override
	public void clear() {
		this.dArr.clear();
	}
	
	// iterator 반환
	@Override
	public Iterator<E> iterator() {
		return this.dArr.iterator();
	}
}
