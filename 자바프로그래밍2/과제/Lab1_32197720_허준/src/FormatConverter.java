//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public abstract class FormatConverter { //extension을 converter에 따라 변경해준다
	private String extension;

	public FormatConverter(String extension) { //생성자
		super();
		this.extension = extension;
	}

	public String getExtension() { //extension을 get
		return extension;
	}
	
	abstract void save(String filenameWithoutExtension); //converter에 따라 다른 extension을 save
}
