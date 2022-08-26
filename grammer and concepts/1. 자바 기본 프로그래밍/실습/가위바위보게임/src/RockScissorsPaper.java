/*
 * 두 사람이 하는 가위바위보 게임을 만들어보자. 두 사람의 이름은 '철수'와 '영희'이다. 먼저 "철수 >>"를 출력하고 "가위", "바위", "보" 중 하나를 문
 * 자열로 입력받는다. 그리고 "영희 >>"를 출력하고 마찬가지로 입력받는다. 입력받은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.
 */

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("철수 >>");
		String chulChoice = sc.nextLine(); //철수의 가위, 바위, 보 중 하나를 저장
		System.out.printf("영희 >>");
		String yungChoice = sc.nextLine(); //영희의 가위, 바위, 보 중 하나를 저장
		
		boolean chulWin = false; //false면 영희 승, true면 철수 승
		boolean error = false; //올바르지 않은 값을 입력할 경우 true
		
		if (chulChoice.equals(yungChoice)) {//서로 같은 것을 낸 경우
			System.out.println("비겼습니다");
		}
		else 
		{ //서로 다른 것을 낸 경우
			if ((yungChoice.equals("가위")) || (yungChoice.equals("바위")) || (yungChoice.equals("보"))) { //영희가 올바른 값을 입력한 경우
				switch (chulChoice) { //철수가 낸 것 기준
				case "가위" : 
					if (yungChoice.equals("보")) //철수가 이긴 경우
						chulWin = true;
					break;
				case "바위" :
					if (yungChoice.equals("가위")) //철수가 이긴 경우
						chulWin = true;
					break;
				case "보" :
					if (yungChoice.equals("바위")) //철수가 이긴 경우
						chulWin = true;
					break;
				default : //철수가 이상한 값을 입력한 경우
					error = true;
					System.out.println("올바른 값을 입력하세요");
				}
				
				if (error == false) //입력에 오류가 없으면 결과를 출력
					System.out.println( (chulWin) ? "철수가 이겼습니다" : "영희가 이겼습니다");	
			}
			else { //영희가 이상한 값을 입력한 경우
				System.out.println("올바른 값을 입력하세요");
			}
		}
		
		sc.close();
	}
	
}
