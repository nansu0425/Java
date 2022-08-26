
public class FractionArithmeticOperation {
	public Fraction value = Fraction.ZERO; // default
	
	public static Fraction plus(Fraction a, Fraction b) { // 분수 덧셈
		return new Fraction(a.getNumerator()*b.getDenominator() + b.getNumerator()*a.getDenominator(), 
							a.getDenominator()*b.getDenominator());
	}
	
	public static Fraction minus(Fraction a, Fraction b) { // 분수 뺄셈
		return new Fraction(a.getNumerator()*b.getDenominator() - b.getNumerator()*a.getDenominator(), 
							a.getDenominator()*b.getDenominator());
	}
	
	public static Fraction multiply(Fraction a, Fraction b) { // 분수 곱셈
		return new Fraction(a.getNumerator()*b.getNumerator(), a.getDenominator()*b.getDenominator());
	}
	
	public static Fraction divide(Fraction a, Fraction b) { // 분수 나눗셈
		return new Fraction(a.getNumerator()*b.getDenominator(), a.getDenominator()*b.getNumerator());
	}
	
	public static Fraction power(Fraction a, int exponents) { // 분수 거듭제곱
		if (exponents == 0)
			return new Fraction(1, 1);
		
		return multiply(a, power(a, exponents - 1));
	}
	
	public static Fraction root(Fraction a, double exponents) { // 분수 거듭제곱근
		return new Fraction((int)Math.pow(a.getNumerator(), 1.0/exponents), (int)Math.pow(a.getDenominator(), 1.0/exponents));
	}
}
