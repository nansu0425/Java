/*
 * 04 예제에서 작성한 Book 클래스의 생성자를 this()를 이용하여 수정하라
 */

public class Book {
	String title; //제목 필드
	String author; //작가 필드
	
	void show() { //제목과 작가 정보 출력
		System.out.println(title + " " + author);
	}
	
	public Book() { //매개변수가 없는 생성자
		this("", "");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) { //제목을 매개변수로 받는 생성자
		this(title, "작자미상");
	}
	
	public Book(String title, String author) { //제목과 작가를 매개변수로 받는 생성자
		this.title = title;
		this.author = author;
	}
	
	public static void main (String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); //어린왕자 객체 생성
		Book loveStory = new Book("춘향전"); //춘향전 객체 생성
		Book emptyBook = new Book(); //빈책 객체 생성
		loveStory.show(); //제목과 작가 정보 출력
	}
}
