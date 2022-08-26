/*
 * 해시맵을 이용하여 학생의 이름과 자바 점수를 기록 관리하는 프로그램을 작성하라
 */

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapScoreEx {
	public static void main (String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		//scoreMap에 요소 추가
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		scoreMap.put("김남윤", 98);
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		
		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());
		
		//Iterator와 Set 컬렉션을 이용하여 scoreMap 요소를 모두 출력
		Set<String> names = scoreMap.keySet(); //scoreMap의 이름들을 names에 저장
		Iterator<String> it = names.iterator(); //names 값을 읽어오기 위한 iterator
		
		while(it.hasNext()) { //남아있는 이름이 있을 때 까지 출력
			String name = it.next(); //남아있는 이름 중 하나를 name에 저장
			int score = scoreMap.get(name); //학생에 해당하는 점수를 score에 저장
			System.out.println(name + " : " + score); 
		}
	}
}
