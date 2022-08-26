
/*
 * 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main (String[] args) {
		ArrayList<String> al = new ArrayList<String>(); //String 타입 ArrayList
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) { //이름 4개를 입력받고 al에 저장
			System.out.print("이름을 입력하세요>> ");
			al.add(sc.next());
		}
		
		for (String s : al) //모든 이름 출력
			System.out.print(s + " ");
		System.out.println();
		
		int longestIndex = 0; //가장 긴 문자열 index
		for (int i = 0; i < al.size(); i++) {
			if (al.get(longestIndex).length() < al.get(i).length()) //i번째 요소가 longestIndex요소 보다 크면
				longestIndex = i; //i가 longestIndex
		}
		System.out.println("가장 긴 이름은 : " + al.get(longestIndex));
		sc.close();
	}
}
