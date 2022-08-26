/*
 * 자동 타입 변환과 강제 타입 변환이 포함된 코드 
 */

//TypeConversion 클래스
public class TypeConversion {
	
	//main() 메소드
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i); //i가 더 큰 int 타입이므로 byte 타입인 b는 int로 자동 형변환
		System.out.println(10/4); //정수 끼리 나눴으므로 2
		System.out.println(10.0/4); //4가 실수로 자동 형변환 되어 실수 끼리의 연산이 되므로 2.5
		System.out.println((char)0x12340041); //char로 캐스팅되어 0x0041인 'A'
		System.out.println((byte)(b+i)); //227이 byte로 캐스팅되어 -29
		System.out.println((int)2.9 + 1.8); //2.9가 캐스팅되어 2가 되고 1.8이 실수이므로 2는 실수로 자동 형변환 되어 3.8
		System.out.println((int)(2.9 + 1.8)); //4.7이 정수 타입으로 캐스팅되어 4
		System.out.println((int)2.9 + (int)1.8); //2.9, 1.8 모두 정수로 캐스팅되어 2, 1이 되므로 3
	}
	
}
