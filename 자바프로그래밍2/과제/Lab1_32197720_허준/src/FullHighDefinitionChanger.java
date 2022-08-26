//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class FullHighDefinitionChanger extends ResolutionChanger { //resolution을 FHD로 change
	public FullHighDefinitionChanger() { //FHD resolution으로 초기화
		super(1920, 1080);
	}

	@Override
	void change(String filename) { //resolution이 change된 것을 출력
		// TODO Auto-generated method stub
		System.out.println("Resolution of " + filename + " is changed to " + toString());
	}
}
