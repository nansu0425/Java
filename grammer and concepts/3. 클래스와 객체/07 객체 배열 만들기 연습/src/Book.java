/*
 * 04 예제의 Book 클래스를 활용하여 2개짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하라
 */

import java.util.Scanner;

public class Book {
	String title; //제목 필드
	String author; //작가 필드
	boolean empty = false; //빈채 여부를 결정하는 필드
	
	public Book() { //매개변수가 없는 생성자
		empty = true;
	}
	
	public Book(String title) { //제목이 매개변수인 생성자
		this(title, "작자미상");
	}
	
	public Book(String title, String author) { //제목과 작가를 매개변수로 하는 생성자
		this.title = title;
		this.author = author;
	}
	
	public void show() { //제목과 작가 정보를 출력
		if (empty) 
			System.out.print("(빈책)"); //빈책인 경우
		else
			System.out.print("(" + title + ", " + author +")"); //빈책이 아닌 경우
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] b = new Book[2]; //원소가 2개인 Book 배열
		
		for (int i = 0; i < b.length; i++) { //b 배열의 객체 생성
			// 제목과 작가 정보 입력
			System.out.print("제목>> ");
			String title = sc.nextLine();
			System.out.print("작가>> ");
			String author = sc.nextLine();
			
			//객체 생성
			if (author.equals("")) { //작가 입력이 되지 않은 경우
				if (title.equals("")) //제목 입력도 되지 않은 경우
					b[i] = new Book(); //매개변수가 없는 생성자 호출
				else
					b[i] = new Book(title); //제목이 매개변수인 생성자 호출
			} else 
				b[i] = new Book(title, author); //제목, 작가가 매개변수인 생성자 호출
		}
		
		for (int i = 0; i < b.length; i++)  //책의 정보 출력
			b[i].show();
		
		sc.close();
	}
}
