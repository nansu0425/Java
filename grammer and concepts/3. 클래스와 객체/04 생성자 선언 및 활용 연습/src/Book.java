/*
 * 제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스를 작성하고, 생성자를 작성하여 필드를 초기화하라
 */

public class Book {
	String title; //제목 필드
	String author; //작가 필드
	
	public Book(String t) { //제목을 매개변수로 받는 생성자		
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) { //제목과 작가를 매개변수로 받는 생성자
		title = t;
		author = a;
	}
	
	public static void main (String[] args) {
		Book b1 = new Book("어린왕자", "생텍쥐페리"); //b1객체를 생성하면서 제목과 작가를 초기화
		System.out.println(b1.title + " " + b1.author); 
		
		Book b2 = new Book("춘향전"); //b2객체를 생성하면서 제목을 초기화
		System.out.println(b2.title + " " + b2.author);
	}
}
