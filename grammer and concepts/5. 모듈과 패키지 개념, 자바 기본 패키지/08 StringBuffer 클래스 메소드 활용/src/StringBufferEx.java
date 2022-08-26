/*
 * StringBuffer를 이용하여 문자열을 조작하는 다음 코드의 실행 결과는 무엇인가
 */

public class StringBufferEx {
	public static void main (String[] arg) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil"); //문자열 덧붙히기
		System.out.println(sb);
		
		sb.insert(7, " my"); //index 7번에 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); //index 8번부터 10번 전까지의 문자열을 your로 대치
		System.out.println(sb);
		
		sb.delete(8, 13); //index 8번부터 13번 전 까지의 문자열을 삭제
		System.out.println(sb);
		
		sb.setLength(4); //문자열 길이를 4로 수정
		System.out.println(sb);
	}
}
