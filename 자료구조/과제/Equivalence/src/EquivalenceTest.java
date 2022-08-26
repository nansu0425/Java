// 32197720 허준
public class EquivalenceTest {

	public static void main(String[] args) {
		int[][] equivalenceRelation1 = { // 1~12까지의 동치 관계 정의
				{1, 5}, {4, 2}, {7, 11}, {9, 10}, {8, 5}, {7, 9}, {4, 6}, {3, 12}, {12, 1}
		};
		
		int[][] equivalenceRelation2 = { // 1~9까지의 동치 관계 정의
				{3, 6}, {1, 5}, {6, 8}, {7, 9}, {2, 1}, {4, 9}, {5, 7}
		};
		
		int[][]  equivalenceRelation3 = { // 1~15까지의 동치 관계 정의
				{2, 8}, {1, 9}, {3, 8}, {12, 4}, {7, 6}, {6, 4}, {11, 13}, {15, 5}, {3, 11}, {10, 14}
		};
		
		// 정의된 동치 관계를 이용해 Equivalence의 instance 생성
		Equivalence e1 = new Equivalence(equivalenceRelation1);
		Equivalence e2 = new Equivalence(equivalenceRelation2); 
		Equivalence e3 = new Equivalence(equivalenceRelation3);
		
		// 각 instance의 동치 부류 출력 
		System.out.println("Equivalence classes of equivalenceRelation1");
		e1.PrintEquivalenceClass();
		System.out.println();
		 
		System.out.println("Equivalence classes of equivalenceRelation2");
		e2.PrintEquivalenceClass();
		System.out.println();
		
		System.out.println("Equivalence classes of equivalenceRelation3");
		e3.PrintEquivalenceClass();
		System.out.println();
	}
}
