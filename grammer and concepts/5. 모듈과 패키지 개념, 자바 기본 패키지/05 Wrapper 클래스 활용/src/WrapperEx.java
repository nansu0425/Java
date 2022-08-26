/*
 * 다음은 Wrapper 클래스를 활요하는 예이다
 * 다음 프로그램의 결과는 무엇인가
 */

public class WrapperEx {
	public static void main (String[] args) {
		System.out.println(Character.toLowerCase('A')); //문자를 소문자로 바꾼다
		
		char c1 = '4', c2 = 'F';
		if (Character.isDigit(c1)) //c1이 숫자이면
			System.out.println(c1 + "는 숫자");
		if (Character.isAlphabetic(c1)) //c2가 영문자이면
			System.out.println(c1 + "는 영문자");
		
		System.out.println(Integer.parseInt("-123")); //문자열 -123을 int type 데이터로 바꾼다
		System.out.println(Integer.toHexString(28)); //정수 28을 16진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); //정수 28을 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); //28이 2진수일 때 1의 갯수
		
		Double d = Double.valueOf(3.14); //값이 3.14인 Wrapper의 Double type 객체 생성
		System.out.println(d.toString()); //실수 3.14를 문자열로 변환
		System.out.println(Double.parseDouble("3.14")); //문자열 3.14를 실수로 변환
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); //boolean type의 true를 문자열로 변환
		System.out.println(Boolean.parseBoolean("true")); //문자열 true를 boolean type으로 변환
	}
}
