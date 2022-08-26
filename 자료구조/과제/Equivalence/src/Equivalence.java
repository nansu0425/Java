// 32197720 허준
public class Equivalence {
	private int[][] equivalenceRelation; // 동치 관계
	private int cntPairs; // 동치쌍의 수
	private int cntVariables; // 변수의 수
	private Node[] nodes; // 동치 부류를 만들기 위한 노드 배열
	private Node[] seq;  // 연결된 노드의 헤드 노드를 가리키는 배열
	private boolean[] bit; // 출력 확인을 위한 배열
	
	public Equivalence(int[][] equivalenceRelation) { // 생성자
		super();
		this.equivalenceRelation = equivalenceRelation; // 동치 관계 초기화
		this.cntPairs = this.equivalenceRelation.length; // 동치쌍의 수 설정
		this.nodes = new Node[2*this.cntPairs]; // node의 수 = 동치쌍의 수*2
		for (int i = 0; i < this.nodes.length; i++) { // 노드 배열에 노드 객체 생성
			this.nodes[i] = new Node();
		}
		// equivalenceRelation의 원소 중 최대 값을 찾아 변수의 수를 설정
		for (int[] pair : this.equivalenceRelation) { 
			for (int num : pair) {
				if (num > this.cntVariables)
					this.cntVariables = num;
			}
		}
		this.seq = new Node[this.cntVariables]; // seq의 수 = 변수의 수
		this.bit = new boolean[this.cntVariables]; // bit의 수 = 변수의 수
		CreateEquivalenceClassList(this.cntPairs, this.cntVariables); // 동치 부류 list 생성
	}
	
	private void CreateEquivalenceClassList(int cntPairs, int cntVariables) { // 동치 쌍과 변수의 수를 이용해 동치 부류 list 생성
		int av = 0;
		for (int k = 0; k < this.cntPairs; k++) {
			// 쌍의 원소를 i, j에 저장
			int i = this.equivalenceRelation[k][0];
			int j = this.equivalenceRelation[k][1];
			
			// j를 리스트 i에 첨가
			this.nodes[av].setData(j);
			if (this.seq[i-1] != null) // 노드를 가리키고 있는 경우
				this.nodes[av].setLink(this.seq[i-1]); // 기존에 가리키던 노드를 향아도록 link 설정
			this.seq[i-1] = this.nodes[av]; av++;
			
			// i를 리스트 j에 첨가
			this.nodes[av].setData(i); 
			if (this.seq[j-1] != null) // 노드를 가리키고 있는 경우
				this.nodes[av].setLink(this.seq[j-1]); // 기존에 가리키던 노드를 향아도록 link 설정
			this.seq[j-1] = this.nodes[av]; av++;
		}
	}

	public void PrintEquivalenceClass() { // 모든 동치 부류 출력
		int index = 0; // bit 배열의 index
		while (index <= this.cntVariables - 1) { // bit의 처음부터 끝 까지 확인
			if (this.bit[index] == false) { // 해당 index의 bit가 false인 경우
				System.out.print("A new class : " + (index + 1) + " ");
				this.bit[index] = true; // 출력시키는 부류를 표시
				Node ptr = this.seq[index]; Node top = null; // 스택을 초기화
				
				// 부류 전체를 탐색
				while (true) {
					while (ptr != null) { // 리스트의 처리
						int j = ptr.getData();
						if (this.bit[j-1] == false) {
							System.out.print(j + " "); this.bit[j-1] = true;
							Node t = ptr.getLink(); ptr.setLink(top);
							top = ptr; ptr = t;
						} else {
							ptr = ptr.getLink();
						}
					}
					
					if (top == null) // 공백 스택
						break;
					ptr = this.seq[top.getData() - 1];
					top = top.getLink();
				}
				System.out.println();
			}
			index++;
		}
	}
}
