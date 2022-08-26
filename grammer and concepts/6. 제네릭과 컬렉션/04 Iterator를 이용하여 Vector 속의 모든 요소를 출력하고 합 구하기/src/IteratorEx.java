/*
 * 예제 7-1의 코드를 Iterator<Integer>를 이용하여 수정하라
 */

import java.util.Vector;
import java.util.Iterator;

public class IteratorEx {
	public static void main (String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //Integer 타입만 다루는 Vector
		
		//v에 요소 삽입
		v.add(5); v.add(4); v.add(100); v.add(-1);
		
		Iterator<Integer> it = v.iterator(); //Iterator는 인터페이스이므로 생성자가 없다 따라서 iterator()메소드를 통해 객체를 생성
		while (it.hasNext()) //v의 요소를 모두 출력, 반환할 요소가 남아있을 때 까지 반복
			System.out.println(it.next()); //n에 요소를 순차적으로 출력
		
		
		int sum = 0;
		it = v.iterator(); //it이 가리키는 요소 재설정
		while (it.hasNext()) //v의 요소를 sum에 순차적으로 더한다
			sum += it.next();
		
		System.out.println("벡터에 있는 정수 합 : " + sum);

	}
}
