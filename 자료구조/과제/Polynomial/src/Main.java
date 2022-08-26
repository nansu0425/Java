// 32197720 허준
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner class의 instance
		
		// 첫 번째 다항식을 입력받고 생성
		System.out.println("Input first polynomial..");
		String firstInput = sc.nextLine();
		Polynomial firstPoly = new Polynomial(firstInput); 
		
		// 두 번째 다항식을 입력받고 생성
		System.out.println("Input second polynomial..");
		String secondInput = sc.nextLine();
		Polynomial secondPoly = new Polynomial(secondInput);
		
		System.out.println();
		
		// 각 다항식의 orderedList 출력
		System.out.print("OrderedList of first polynomial : ");
		firstPoly.orderedListPrint();
		System.out.print("OrderedList of second polynomial : ");
		secondPoly.orderedListPrint();
		
		System.out.println();
		
		// 두 다항식의 합 출력
		System.out.println("Sum of two polynomials is");
		System.out.println(firstPoly.addPolynomial(secondPoly));
		
		sc.close();
	}

}
