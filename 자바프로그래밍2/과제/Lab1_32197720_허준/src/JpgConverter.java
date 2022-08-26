//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class JpgConverter extends FormatConverter { //extension을 jpg로 convert
	
	public JpgConverter() { //extension을 jpg로 초기화
		super("jpg");
	}
	
	@Override
	public void save(String filenameWithoutExtension) { //extension이 jpg로 변경된 것을 출력
		// TODO Auto-generated method stub
		System.out.println("Save image converted to " + filenameWithoutExtension + "." + getExtension());
	}
}
