/*
 * 2차원 배열에 학년별로 1, 2학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력하라.
 */

public class SourceAverage {
	public static void main (String[] args) {
		double score[][] = {{3.3, 3.4}, //1학년 1, 2학기 성적 
							{3.5, 3.6}, //2학년 1, 2학기 성적
							{3.7, 4.0}, //3학년 1, 2학기 성적
							{4.1, 4.2}}; //4학년 1, 2학기 성적
		double sum = 0; //성적의 총합
		int count = 0; //성적의 수
		
		for (double year[] : score) { //score의 행 index순으로 year 배열에 저장
			for (double term : year) { //year배열 원소를 index순으로 term에 저장
				sum += term; //sum에 term 값을 더한다
				count++; //더한 횟수를 count
			}
		}
		
		System.out.println("4년 전체 평점 평균은 " + sum/count);
	}
}
