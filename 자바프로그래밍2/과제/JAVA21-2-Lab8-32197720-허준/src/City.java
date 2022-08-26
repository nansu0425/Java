
public class City {
	private String city; // 도시
	private String country; // 나라
	
	// 생성자
	public City(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
	// toString
	@Override
	public String toString() {
		return "City [city=" + city + ", country=" + country + "]";
	}	
}
