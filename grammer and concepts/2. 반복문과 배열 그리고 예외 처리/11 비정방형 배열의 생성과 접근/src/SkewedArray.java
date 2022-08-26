/*
 * 비정방형 배열을 만들고 첫 번째 행 {10, 11, 12}, 두 번째 행 {20, 21}, 세 번째 행 {30, 31, 32}, 네 번째 행  {40, 41}이 되도록
 * 반복문으로 값을 초기화하고 출력하라.
 */

public class SkewedArray {
	public static void main (String[] args) {
		int array[][] = new int[4][]; //4행 크기의 2차원 배열 선언
		array[0] = new int[3]; //첫 번재 행 배열의 크기는 3
		array[1] = new int[2]; //두 번째 행 배열의 크기는 2
		array[2] = new int[3]; //세 번째 행 배열의 크기는 3
		array[3] = new int[2]; //네 번재 행 배열의 크기는 4
		
		for (int i = 0; i < array.length; i++) { //array의 행 개수 만큼 반복
			for (int j = 0; j < array[i].length; j++) {  //현재 행의 열 개수 만큼 반복
				array[i][j] = (i + 1)*10 + j; //i행 j열에 계산 값을 대입
				System.out.print(array[i][j] + " "); //현재 원소 출력
			}
			
			System.out.println(); //줄바꿈
		}
		
	}
}
