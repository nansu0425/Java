/*
 * for-each 문을 활용하는 사례를 보자
 */

public class ForeachEx {
	enum Week { 월, 화, 수, 목, 금, 토, 일 } //요일에 대한 enum 데이터
	
	public static void main (String[] args) {
		int n [] = {1, 2, 3, 4, 5}; //정수형 배열
		String names [] = {"사과", "배", "바나나", "체리", "딸기", "포도"}; //문자열 배열
		
		int sum = 0; //배열 n의 합을 저장
		for (int i : n) { //i에 n의 원소를 index순으로 대입
			System.out.print(i + " ");
			sum += i; //i를 sum에 더한다
		}
		System.out.println("합은 " + sum);
		
		for (String name : names) //name에 names의 원소를 index순으로 대입
			System.out.print(name + " ");
		System.out.println(); //줄바꿈
		
		for (Week day : Week.values()) //day에 Week의 상수들을 원소로 갖는 배열의 원소를 index순으로 대입
			System.out.print(day + "요일 ");
	}
}
