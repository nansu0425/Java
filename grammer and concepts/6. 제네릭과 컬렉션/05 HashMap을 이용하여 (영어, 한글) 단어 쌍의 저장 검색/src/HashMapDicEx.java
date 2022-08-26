/*
 * (영어, 한글) 단어를 쌍으로 해시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하라
 * "exit"이 입력되면 프로그램을 종료한다
 */

import java.util.Scanner;
import java.util.HashMap;

public class HashMapDicEx {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//3개의 (key, value) 쌍을 dic에 저장
		dic.put("apple", "사과");
		dic.put("love", "사랑");
		dic.put("baby", "아기");
		
		//사용자로부터 영어 단어를 입력받고 한글 단어 검색, "exit" 입력받으면 종료
		while (true) {
			System.out.print("찾고 싶은 단어는?");
			String eng = sc.next(); //영어단어를 입력받는다
			
			if (eng.equals("exit")) { //exit을 입력한 경우
				System.out.println("종료합니다...");
				break;
			}
			
			String kor = dic.get(eng); //영어단어에 해당하는 한국말을 찾는다
			if (kor == null) //등록된 영어단어가 아닌 경우
				System.out.println(eng + "은/는 없은 단어 입니다");
			else //등록된 영단의 경우
				System.out.println(kor);
			
		}
		
		sc.close();
	}
}
