
public class FractionComparator<T> implements Comparator<T> {
	private Fraction o1;
	private Fraction o2;
	
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		this.o1 = (Fraction) o1;
		this.o2 = (Fraction) o2;
		
		// 최대공약수
		int gcd = Fraction.gcd(this.o1.getDenominator(), this.o2.getDenominator());
		
		// 최송공배수
		int lcm = this.o1.getDenominator()*this.o2.getDenominator()/gcd;
		
		// 최소공배수를 곱한 분자끼리 비교
		if (this.o1.getNumerator()*lcm > this.o2.getNumerator()*lcm)
			return 1;
		else
			return 0;
	}

}
