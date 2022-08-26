/*
 * 비트 논리 연산과 비트 시프트 연산을 사용한 프로그램
 */

public class BitOperator {
	
	public static void main (String[] args) {
		short a = (short) 0x55ff; // 0101 0101 1111 1111
		short b = (short) 0x00ff; // 0000 0000 1111 1111
		
		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); // AND, 0000 0000 1111 1111
		System.out.printf("%04x\n", (short)(a | b)); // OR, 0101 0101 1111 1111
		System.out.printf("%04x\n", (short)(a ^ b)); // XOR, 0101 0101 0000 0000
		System.out.printf("%04x\n", (short)(~a)); // NOT, 1010 1010 0000 0000
		
		byte c = 20; // 0x14, 0001 0100 
		byte d = -8; // 0xf8, 1111 1000
		
		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2); // 왼쪽 산술 시프트 두 번(x4), 0101 0000
		System.out.println(c >> 2); // 오른쪽 산술 시프트 두 번(/4), 0001 0100
		System.out.println(d >> 2); // 오른쪽 산술 시프트 두 번(/4), 1111 1110
		System.out.printf("%x\n", (d >>> 2)); // 왼쪽 논리 시프트 두번(시프트 계산 전 int 타입 변환), 0011 1111 1111 1111 1111 1111 1111 1110
	}
	
}
