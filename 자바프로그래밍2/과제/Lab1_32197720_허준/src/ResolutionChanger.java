//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public abstract class ResolutionChanger extends Resolution { //Changer 종류에 따라 다른 resolution 값으로 change

	public ResolutionChanger(int widthPixels, int heightPixels) { //생성자
		super(widthPixels, heightPixels);
	}
	
	abstract void change (String filename); //Resolution을 change
}
