/*
 * id와 tel(전화번호)로 구성되는 Student 클래스를 만들고, 이름을 '키'로 하고 Student 객체를 '값'으로 하는 해시맵을 작성하라
 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
	public static void main (String[] args) {
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		//studentMap에 학생이름과 학생의 정보를 추가
		studentMap.put("황기태", new Student("1", "010-111-1111"));
		studentMap.put("이재문", new Student("2", "010-222-2222"));
		studentMap.put("김남윤", new Student("3", "010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while (true) { //이름을 검색하면 학생의 정보를 출력
			System.out.print("검색할 이름? ");
			String name = sc.next(); //이름 입력
			
			if (name.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			} else if (studentMap.containsKey(name))
				System.out.println(studentMap.get(name));
			else
				System.out.println("없는 이름 입니다");
		}
		
		sc.close();
	}
}
