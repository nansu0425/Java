/*
 * Collections 클래스를 활용하여 문자열 정렬, 반대로 정렬, 이진 검색을 실행하는 사례를 살펴보자
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class CollectionsEx {
	public static void printList (LinkedList<String> l) { //링크드리스트 모든 요소 출력
		Iterator<String> it = l.iterator();
		
		while (it.hasNext()) { //출력할 영화가 남아있으면 반복
			String movie = it.next();
			String seperator; //화살표
			if (it.hasNext()) //다음 출력할 영화가 있으면
				seperator = "->";
			else //마지막 영화면
				seperator = "\n";
			System.out.print(movie + seperator);
		}
	}
	
	public static void main (String[] args) {
		LinkedList<String> movieList = new LinkedList<String>();
		//영화 목록 추가
		movieList.add("트랜스포머");
		movieList.add("스타워즈");
		movieList.add("매트릭스");
		movieList.add(0, "터미네이터");
		movieList.add(2, "아바타");
		
		Collections.sort(movieList); //영화 목록 정렬
		printList(movieList);
		
		Collections.reverse(movieList); //영화 목록 거꾸로 정렬
		printList(movieList);
		
		int index = Collections.binarySearch(movieList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소 입니다");
	}
}
