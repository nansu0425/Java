/*
 * 객체 레퍼런스만으로 객체의 클래스명, 헤시코드 값, 객체의 문자열을 출력해보자
 */

public class ObjectPropertyEx {
	public static void print(Object obj) {
		//객체의 클래스에 대한 정보를 가진 객체를 getClass가 반환하고 그 객체의 getName 메소드를 통해 obj 객체의 class type을 알 수 있다
		System.out.println(obj.getClass().getName()); 
		System.out.println(obj.hashCode()); //현 객체의 해쉬코드 출력
		System.out.println(obj.toString()); //객체의 정보 출력
	}
	
	public static void main (String[] args) {
		print(new Point()); //객체 정보 출력
	}
}
