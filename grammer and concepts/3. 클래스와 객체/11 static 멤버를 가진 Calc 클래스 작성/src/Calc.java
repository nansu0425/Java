
public class Calc {
	static int abs(int num) { //절대값 
		return (num > 0) ? num : num*-1;
	}
	
	static int max(int a, int b) { //최대값
		return (a < b) ? b : a;
	}
	
	static int min(int a, int b) { //최소값
		return (a < b) ? a : b;
	}
}
