// 32197720 허준
public class Polynomial { // 다항식을 정의하는 class
	private Term[] terms; // 다항식 항들의 배열
	private int[] orderedList; // 다항식을 표현을 위한 순서 리스트
	
	public Polynomial(String input) { // 문자열 형태의 다항식을 매개변수로 받는 생성자
		input = input.replace("x^", " "); // x^을 ' '으로 replace
		input = input.replace("+", " "); // +를 ' '으로 replace
		input = input.replace("-", " -"); // -를 ' -'로 replace
		input = input.trim(); // 문자열 앞뒤 공백 제거
		String[] temp = input.split(" "); // 공백 기준으로 문자열을 분리
		
		int termCount = (int) Math.ceil(temp.length/2.0); // 항의 개수
		terms = new Term[termCount]; // 항 배열의 크기 지정
		orderedList = new int[2*termCount + 1]; // 순서 리스트의 크기 지정
		
		orderedList[0] = termCount; // 순서 리스트의 첫 번째 원소는 항의 개수
		for (int i = 0; i < temp.length; i += 2) {
			int coefficient = Integer.parseInt(temp[i]); // 계수를 Integer로 변환 
			int exponent; // Integer type으로 지수를 저장할 변수
			
			if (i+1 == temp.length) { // 차수가 0인 항이 있는 경우
				exponent = 0;
			} else { // 차수가 0인 항이 없는 경우
				exponent = Integer.parseInt(temp[i+1]);
			}
			
			// orderedList와 terms 원소 초기화
			orderedList[i+1] = exponent;
			orderedList[i+2] = coefficient;
			terms[i/2] = new Term(exponent, coefficient);
		}
	}
	
	public Polynomial addPolynomial(Polynomial polynomial) { // 매개변수의 polynomial를 더해서 반환
		int p = 1; // this.orderedList의 지수 pointer 
		int q = 1; // 매개변수 다항식의 orderedList 지수 pointer
		
		// 매개변수 다항식의 orderedList와 항 배열
		int[] orderedList = polynomial.getOrderedList();
		Term[] terms = polynomial.getTerms();
		
		String resultInput = ""; // 더해진 다항식을 문자열로 저장하기 위한 변수
		
		// resultInput에 두 다항식의 대입, 더할 수 있으면 더한다
		while (p < this.orderedList.length && q < orderedList.length) {
			if (this.orderedList[p] == orderedList[q]) { // 항의 지수가 같을 경우
				resultInput += Term.termToString(this.terms[p/2].addTerm(terms[q/2])); // 두 항을 더하고 resultInput에 더한다
				p += 2; q += 2; // p, q가 다음 항의 지수를 point
			} else if (this.orderedList[p] < orderedList[q]) { // 매개변수 다항식의 지수가 더 클 경우
				resultInput += Term.termToString(terms[q/2]);
				q += 2; // q가 다음 항의 지수를 point
			} else if (this.orderedList[p] > orderedList[q]) { // 필드 다항식의 지수가 더 클 경우
				resultInput += Term.termToString(this.terms[p/2]);
				p += 2; // p가 다음 항의 지수를 point
			}
		}
		// 필드 다항식의 나머지 항들을 더한다
		while (p < this.orderedList.length) {
			resultInput += Term.termToString(this.terms[p/2]);
			p += 2; // p가 다음 항의 지수를 point
		}
		
		// 매개변수 다항식의 나머지 항들을 더한다
		while (q < orderedList.length) {
			resultInput += Term.termToString(terms[q/2]);
			q += 2; // q가 다음 항의 지수를 point
		}
		
		resultInput = resultInput.trim(); // 양 끝 공백 제거
		resultInput = resultInput.replace(" ", "+"); // 공백을 +로 replace
		
		return new Polynomial(resultInput);
	}

	public void orderedListPrint() { // orderedList 출력
		System.out.print("(");
		for (int i = 0; i < orderedList.length; i++) {
			if (i + 1 == orderedList.length)
				System.out.println(orderedList[i] + ")");
			else
				System.out.print(orderedList[i] + ", ");
		}
	}
	
	// field getters
	public Term[] getTerms() {
		return terms;
	}
	
	public int[] getOrderedList() {
		return this.orderedList;
	}
	
	@Override
	public String toString() {
		String polynomialString = "";
		for (Term t : this.terms) { // polynomialString에 각 항을 문자열 형태로 저장
			polynomialString += Term.termToString(t);
		}
		
		polynomialString = polynomialString.trim(); // 양 끝 공백 제거
		polynomialString = polynomialString.replace(" ", "+"); // 공백을 +로 replace
		return polynomialString;
	}
}