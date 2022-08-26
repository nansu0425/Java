/*
 * Scanner 클래스로 이름, 도시, 나이, 체중, 독신 여부를 입력받고 다시 출력하는 프로그램을 작성
 */

import java.util.Scanner; //Scanner 클래스가 존재하는 패키지를 import

// ScannerEx 클래스
public class ScannerEx { 
	
	// main 메소드
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); //다음 토큰을 문자열로 리턴
		String city = sc.next(); //다음 토큰을 문자열로 리턴
		int age = sc.nextInt(); //다음 토큰을 int타입으로 리턴
		int weight = sc.nextInt(); //다음 토큰을 int타입으로 리턴
		boolean solo = sc.nextBoolean(); //다음 토큰을 boolean타입으로 리턴
		
		System.out.println("이름은 " + name + ", 도시는 " + city + ", 나이는 " + age + ", 체중은 " + weight + ", 독신 여부는 " + solo);
		sc.close(); //Scanner 객체 종료, System.in도 같이 종료 되므로 이후 Scanner 객체로 키 입력 받는 것이 불가능
	}
	
}
