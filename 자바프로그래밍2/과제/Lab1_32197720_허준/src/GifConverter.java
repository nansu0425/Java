//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class GifConverter extends FormatConverter { //extension을 gif로 convert
	
	public GifConverter() { //extension을 gif로 초기화
		super("gif");
	}
	
	@Override
	public void save(String filenameWithoutExtension) { //extension이 gif로 변경된 것을 출력
		// TODO Auto-generated method stub
		System.out.println("Save image converted to " + filenameWithoutExtension + "." + getExtension());
	}

}
