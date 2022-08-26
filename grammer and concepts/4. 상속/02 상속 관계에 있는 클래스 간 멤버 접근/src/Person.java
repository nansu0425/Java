
public class Person {
	private int weight; //무게 필드
	int age; //나이 필드
	protected int height; //키 필드
	public String name; //이름 필드
	
	//각 필드를 set 메소드들
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
}
