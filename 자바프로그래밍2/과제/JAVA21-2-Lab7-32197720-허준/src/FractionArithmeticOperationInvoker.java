import java.util.Stack;

public class FractionArithmeticOperationInvoker {
	Stack<Command> commands = new Stack<>(); // Command를 stack에 저장
	
	public void setCommand(Command c) { // Command 받기
		this.commands.push(c); 
	}
	
	public void execute() { // 받은 Command를 execute
		this.commands.peek().execute();
	}
	
	public void undo() { // value로 undo
		if (commands.empty()) {
			System.out.println("되돌릴 연산이 존재하지 않습니다.");
			return;
		}
		
		this.commands.peek().undo();
		this.commands.pop();
	}
}
