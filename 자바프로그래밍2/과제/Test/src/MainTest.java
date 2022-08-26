
public class MainTest {
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) 
				gcd = i;
		}
		
		return gcd;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(2, 4));
		System.out.println(gcd(3, 6));
		System.out.println(gcd(10, 15));
	}
}
