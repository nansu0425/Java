//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class PngConverter extends FormatConverter { //extension을 png로 convert
	
	public PngConverter() { //extension을 png로 초기화
		super("png");
	}
	
	@Override
	public void save(String filenameWithoutExtension) { //extension이 png로 변경된 것을 출력
		// TODO Auto-generated method stub
		System.out.println("Save image converted to " + filenameWithoutExtension + "." + getExtension());
	}

}
