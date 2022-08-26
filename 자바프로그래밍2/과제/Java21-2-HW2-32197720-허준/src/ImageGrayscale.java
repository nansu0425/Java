//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.image.BufferedImage;
import java.awt.Color;

public class ImageGrayscale implements IProcessor {

	@Override
	public BufferedImage process(BufferedImage image) { // grayscale 처리 호출
		// TODO Auto-generated method stub
		return grayscale(image);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Grayscale";
	}
	
	public static BufferedImage grayscale(BufferedImage image) { // image를 grayscale 처리 후 반환
		if (image == null) // image가 없을 경우
			return null;
		
		// outImage 생성
		BufferedImage outImage = 
				new BufferedImage(image.getWidth(), image.getHeight(),image.getType());
		
		// for 문을 돌며 각 pixel을 grayscale 처리
		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++) {
				Color c = new Color(image.getRGB(x, y));
				// NTSC brightness formula
				int b = (int) (c.getRed()*0.299) +
						(int) (c.getGreen()*0.587) +
						(int) (c.getBlue()*0.114);
				
				Color grayColor = new Color(b, b, b);
				outImage.setRGB(x, y, grayColor.getRGB());
			}
		}
		
		return outImage;
	}
}
