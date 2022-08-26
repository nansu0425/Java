
public class DoubleComparator<T> implements Comparator<T> {
	private Double o1;
	private Double o2;
	
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		this.o1 = (Double) o1;
		this.o2 = (Double) o2;
		
		// Double 형끼리의 비교
		return Double.compare(this.o1, this.o2);
	}
	
}
