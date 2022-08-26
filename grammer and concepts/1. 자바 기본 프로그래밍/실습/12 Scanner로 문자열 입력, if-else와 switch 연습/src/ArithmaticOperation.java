/*
 * 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +,=,*,/의 네 가지로 하고 피연산자는 모두 실수로 한다. 
 * 피연산자와 연산자는 빈 칸으로 분리하여 입력한다. 0으로 나누기 시 "0으로 나룰 수 없습니다."를 출력하고 종료한다.
 */

import java.util.Scanner;

public class ArithmaticOperation {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산>>");
		double operand1 = sc.nextDouble(); //첫번째 피연산자
		String operator = sc.next(); //연산자
		double operand2 = sc.nextDouble(); //두번째 피연산자
		double result = 0; //계산 결과 값을 저장
		boolean zeroError = false; //0으로 나룰 때 true
		boolean operatorError = false; //잘못된 연산자를 입력했을 때 true
		
		// if-else 문을 사용하여 연산
		if (operator.equals("+")) { //덧셈 연산
			result = operand1 + operand2; 
		} else if (operator.equals("-")) { //뺄셈 연산
			result = operand1 - operand2;
		} else if (operator.equals("*")) { //곱셈 연산
			result = operand1*operand2;
		} else if (operator.equals("/")) { //나눗셈 연산
			if (operand2 == 0) //0으로 나눌 때
				zeroError = true;
			else //0으로 나누지 않을 때
				result = operand1/operand2;
		} else //연산자가 잘못됐을 때
			operatorError = true;
		
		if (!operatorError) //연산자 error가 없을 때
			System.out.println(zeroError ? "0으로 나룰 수 없습니다" : operand1 + operator + operand2 + " = " + result);
		else //연산자 error가 있을 때
			System.out.println("잘못된 연산자 입니다");
		
		System.out.println("연산>>");
		operand1 = sc.nextDouble(); //첫번째 피연산자
		operator = sc.next(); //연산자
		operand2 = sc.nextDouble(); //두번째 피연산자
		result = 0; //계산 결과 값을 저장
		zeroError = false; //0으로 나룰 때 true
		operatorError = false; //잘못된 연산자를 입력했을 때 true
		
		// switch 문을 사용하여 연산
		switch(operator) {
		case "+" : //덧셈 연산
			result = operand1 + operand2; 
			break;
		case "-" : //뺄셈 연산
			result = operand1 - operand2;
			break;
		case "*" : //곱셈 연산
			result = operand1*operand2;
			break;
		case "/" : //나눗셈 연산
			if (operand2 == 0) //0으로 나눌 때
				zeroError = true;
			else //0으로 나누지 않을 때
				result = operand1/operand2;
			break;
		default : //연산자가 잘못됐을 때
			operatorError = true;
		}
		
		if (!operatorError) //연산자 error가 없을 때
			System.out.println(zeroError ? "0으로 나룰 수 없습니다" : operand1 + operator + operand2 + " = " + result);
		else //연산자 error가 있을 때
			System.out.println("잘못된 연산자 입니다");
		
		sc.close();
	}
}
