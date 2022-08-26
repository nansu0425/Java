/*
 * 소스 파일 : Hello.java
 */

//클래스 영역
public class Hello { 
	 
	//메소드 영역, n과 m의 합을 구한다
	public static int sum(int n, int m) { 
		return n + m;
	}
	
	//main()메소드에서 실행 시작
	public static void main(String[] args) {
		//변수 선언
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); //sum 메소드 호출, 30 저장
		a = '?';
		System.out.println(a); //문자 '?'출력
		System.out.println("Hello"); //"Hello" 문자열 출력
		System.out.println(s); //정수 s의 값 30 출력
	}
	
}
