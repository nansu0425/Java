// 32197720 허준
public class Term { // 다항식 항에 대한 class
	private int exponent; // 지수
	private int coefficient; // 계수
	
	public static String termToString(Term term) { // 항을 String 값으로 반환
		String termString = "";
		
		if (term.getCoefficient() > 0) // 양수일 경우 항의 앞에 공백 추가
			termString += " ";
		
		if (term.exponent == 0) // 항의 지수가 0인 경우
			termString += Integer.toString(term.getCoefficient());
		else // 항의 지수가 0이 아닌 경우
			termString += Integer.toString(term.getCoefficient()) + "x^" + Integer.toString(term.getExponent());
		
		
		return termString;
	}
	
	public Term (int exponent, int coefficient) { // 지수와 계수를 매개변수로 받는 생성자
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	
	public Term addTerm(Term term) { // 매개변수의 항과 더한 항을 반환
		return new Term(this.exponent, this.coefficient + term.getCoefficient());
	}
	
	// field getters
	public int getExponent() {
		return exponent;
	}

	public int getCoefficient() {
		return coefficient;
	}

	@Override
	public String toString() {
		return "Term [exponent=" + exponent + ", coefficient=" + coefficient + "]";
	}
}
