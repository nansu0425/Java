/*
 * String 클래스의 다앙한 메소드를 활용하는 예를 살펴보자
 */

public class StringEx {
	public static void main (String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length()); //a의 길이
		System.out.println(a.contains("#")); //a가 #문자를 포함하고 있으면 true
		
		a = a.concat(b); //문자열 연결
		System.out.println(a);
		
		a = a.trim(); //문자열 앞뒤 공백 제거
		System.out.println(a);
		
		a = a.replace("C#","Java"); //C#문자열을 Java로 대치
		System.out.println(a);
		
		String s[] = a.split(","); //,기준으로 문자열 분리
		for (String i : s)
			System.out.println("분리된 문자열 : " + i);
		
		a = a.substring(5); //index 5번 부터 끝까지
		System.out.println(a);
		
		char c = a.charAt(2); //index 2번의 문자
		System.out.println(c);		
	}
}
