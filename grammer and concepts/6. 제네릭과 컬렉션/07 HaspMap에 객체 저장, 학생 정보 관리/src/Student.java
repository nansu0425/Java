
public class Student {
	private String id;
	private String tel;
	
	public Student (String id, String tel) { //생성자
		this.id = id;
		this.tel = tel;
	}
	
	public String toString() { //toString 오버라이딩
		return "id : " + id + ", 전화 : " + tel; 
	}
}
