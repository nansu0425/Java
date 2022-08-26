//Lab1_자바프로그래밍2_1분반_9월 19일_허준
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageProcessor ip = new ImageProcessor("dog.bmp", 1280, 720);
		ip.setImageProcessor(new Grayscale());
		ip.processImage();
		ip.setImageProcessor(new Blur());
		ip.processImage();
		ip.addConverter(new GifConverter());
		ip.addConverter(new PngConverter());
		ip.addConverter(new JpgConverter());
		ip.convertTo("jpg");
		ip.convertTo("gif");
		ip.convertTo("png");
		ip.convertTo("bmp");
		//My Code
		ip.addChanger(new FullHighDefinitionChanger());
		ip.addChanger(new QuadHighDefinitionChanger());
		ip.addChanger(new UltraHighDefinitionChanger());
		ip.changeTo(new Resolution(1920, 1080));
		ip.changeTo(new Resolution(2560, 1440));
		ip.changeTo(new Resolution(3840, 2160));
		ip.changeTo(new Resolution(1280, 720));
	}

}
