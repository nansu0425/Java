//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class UltraHighDefinitionChanger extends ResolutionChanger { //resolution을 UHD로 change
	public UltraHighDefinitionChanger() { //UHD resolution으로 초기화
		super(3840, 2160);
	}
	
	@Override
	void change(String filename) { //resolution이 change된 것을 출력
		// TODO Auto-generated method stub
		System.out.println("Resolution of " + filename + " is changed to " + toString());
	}

}
