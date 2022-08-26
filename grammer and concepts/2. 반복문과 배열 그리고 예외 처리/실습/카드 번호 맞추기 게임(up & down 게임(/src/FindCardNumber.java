/*
 * 숨겨진 카드의 수를 맞추는 게임을 만들어보자. 
 * 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임이다.
 * 게임을 반복하기 위해 y/n을 묻고, n인 경우 종료된다.
 */

import java.util.Scanner;
import java.util.Random;

public class FindCardNumber {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//게임 시작
		while (true) {
			//0~99사이의 임의의 수를 정한다
			Random r = new Random();
			int randomNum = r.nextInt(100);
			System.out.println("수를 결정하였습니다 맞추어 보세요");
			
			int min = 0; //번호 범위의 최소값
			int max = 99; //번호 범위의 최대값
			int count = 1; //찾기 시도 카운트
			int inputNum; //입력한 번호
			
			//번호를 찾을 때 까지 입력받는다
			while (true) {
				//번호를 입력받는다
				System.out.println(min + "-" + max);
				System.out.print(count + ">>");
				inputNum =sc.nextInt();
				
				//범위 내의 번호를 입력한지 확인
				while (true) {
					if ((min >= inputNum) || (max <= inputNum)) { 
						System.out.println("범위 내의 숫자를 입력하세요");
						System.out.println(min + "-" + max);
						System.out.print(count + ">>");
						inputNum =sc.nextInt();
					} else 
						break;
				}
				
				//입력한 번호와 찾으려고 하는 번호 비교
				if (randomNum == inputNum) { //번호를 맞춘 경우
					System.out.println("맞았습니다");
					break;
				} else if (randomNum < inputNum) { //찾으려는 번호가 입력한 번호보다 작은 경우
					System.out.println("더 낮게");
					max = inputNum; 
					count++;
				} else { //찾으려는 번호가 입력한 번호보다 큰 경우
					System.out.println("더 높게");
					min = inputNum;
					count++;
				}
			}
			
			//게임을 계속 할건지의 여부 결정
			boolean exit = false; //exit이 true면 게임 종료
			while (true) {
				System.out.print("다시 하시겠습니까?(y/n)");
				String yn = sc.next();
				
				if (yn.equals("n")) { //n의 경우
					exit = true;
					break;
				} else if (!yn.equals("y")) //y가 아닌 경우
					System.out.println("y와 n중 하나를 고르세요");
				else //y인 경우
					break;
			}
			
			if (exit) //
				break;
		}
		
		sc.close();
	}
}
