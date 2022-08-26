
public class FractionArithmeticOperationCommand implements Command {
	private FractionArithmeticOperation operation; // 연산
	private String operator; // 연산자
	private Fraction operand; // 피연산자
	private int exponents; // 지수
	
	// constructor
	public FractionArithmeticOperationCommand(FractionArithmeticOperation operation, String operator, Fraction operand) {
		this.operation = operation;
		this.operator = operator;
		this.operand = operand;
	}
	
	public FractionArithmeticOperationCommand(FractionArithmeticOperation operation, String operator, int exponents) {
		this.operation = operation;
		this.operator = operator;
		this.exponents = exponents;
	}
	
	@Override
	public void execute() { // operator 값에 따라 다른 연산
		switch (this.operator) {
		case "+" :
			print("+");
			this.operation.value = FractionArithmeticOperation.plus(this.operation.value, operand);
			print();
			break;
		case "-" :
			print("-");
			this.operation.value = FractionArithmeticOperation.minus(this.operation.value, operand);
			print();
			break;
		case "*" :
			print("*");
			this.operation.value = FractionArithmeticOperation.multiply(this.operation.value, operand);
			print();
			break;
		case "/" :
			print("/");
			this.operation.value = FractionArithmeticOperation.divide(this.operation.value, operand);
			print();
			break;
		case "^" :
			print("^");
			this.operation.value = FractionArithmeticOperation.power(this.operation.value, exponents);
			print();
			break;
		default :
			System.out.println("존재하지 않는 연산자 입니다.");	
		}
	}

	@Override
	public void undo() { // 값을 되돌리기
		if (this.operator.equals("^")) {
			System.out.print("(" + this.operation.value + ")" + operator + "(1/" + this.exponents + ") = ");
			this.operation.value = FractionArithmeticOperation.root(this.operation.value, exponents);
			print();
		} else {
			this.operator = oppositeOperator(this.operator);
			execute();
		}
	}
	
	public String oppositeOperator(String operator) { // 연산자의 반대 연산 반환
		switch (operator) {
		case "+" :
			return "-";
		case "-" :
			return "+";
		case "*" :
			return "/";
		case "/" :
			return "*";
		default :
			System.out.println("존재하지 않는 연사자 입니다.");
			return operator;
		}
	}
	
	private void print(String operator) { // value와 operand 또는 exponents 출력
		if (operator.equals("^"))
			System.out.print("(" + this.operation.value + ")" + operator + this.exponents + " = ");
		else
			System.out.print(this.operation.value + " " + operator + " " + this.operand + " = ");
	}
	
	private void print() { // value만 출력
		System.out.println(this.operation.value);
	}
}
