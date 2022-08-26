/*
 * 정수만 다루는 벡터를 생성하고, 활용하는 기본 사례를 보인다
 */

import java.util.Vector;

public class VectorEx {
	public static void main (String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //Integer 타입만 다루는 Vector
		v.add(5); v.add(4); v.add(-1); //객체 삽입, 자동 박싱
		
		v.add(2, 100); //2번 위치에 100 삽입, -1은 뒤로 이동
		
		System.out.println("백터 내에 요소 객체 수 : " + v.size());
		System.out.println("백터의 현재 용량 : " + v.capacity());
		
		for (int i = 0; i < v.size(); i++) //v의 모든 요소 출력 
			System.out.println(v.get(i)); //자동 언박싱
		
		int sum = 0;
		for (int i : v) //v의 모든 요소 합
			sum += i;
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}
