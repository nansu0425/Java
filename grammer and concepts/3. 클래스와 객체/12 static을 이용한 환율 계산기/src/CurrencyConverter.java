
public class CurrencyConverter {
	private static double rate; //달러의 원화 환율 필드
	
	public static void setRate(double r) { //달러 환율을 초기화
		rate= r;
	}
	
	public static double wonToDollar(double won) { //원화의 달러 환율 계산
		return won/rate;
	}
	
	public static double dollarToWon(double dollar) { //달러의 원화 환율 계산
		return dollar*rate;
	}
}