/*
 * 문자열을 구분 문자를 기준으로 토큰을 분리하고 각 토큰을 출력하라  
 */

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main (String[] args) {
		String string1 = new String("홍길동/장화/홍련/콩쥐/팥쥐");
		StringTokenizer st1 = new StringTokenizer(string1, "/"); //string1을 /를 구분문자로해서 토큰으로 나눈다
		
		int n = st1.countTokens(); //토큰의 갯수를 count
		for (int i = 0; i < n; i++) { //모든 토큰 출력
			System.out.println(st1.nextToken()); //다음 토큰을 출력
		}
		
		String string2 = new String("1+4=6"); 
		StringTokenizer st2 = new StringTokenizer(string2, "+="); //string2를 +와 =을 기준으로 토큰 분리
		
		while (st2.hasMoreTokens()) //남아있는 토큰이 있으면 반복
			System.out.println(st2.nextToken()); //다음 토큰 반환
	}
}
