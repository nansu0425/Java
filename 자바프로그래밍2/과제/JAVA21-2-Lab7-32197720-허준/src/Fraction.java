
public class Fraction {
	private int numerator; // 분자
	private int denominator; // 분모
	public static final Fraction ZERO = new Fraction(0, 1);
	
	public Fraction(int numerator, int denominator) { // Constructor
		if (denominator == 0) { // 분모가 0인 경우
			throw new ArithmeticException();
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
		
		int gcd = gcd(numerator, denominator);
		if (gcd > 1) { // 약분
			this.numerator /= gcd;
			this.denominator /= gcd;
		}
		
		if (numerator == 0) 
			this.denominator = 1;
	}
	
	private int gcd(int numerator, int denominator) { // 최대공약수 구하기
		int gcd = 1;
		
		for (int i = 1; i <= numerator && i <= denominator; i++) {
			if (numerator % i == 0 && denominator % i == 0) 
				gcd = i;
		}
		
		return gcd;
	}
	
	// Getters and Setters
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
}
