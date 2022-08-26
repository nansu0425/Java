//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.image.BufferedImage;

public class ImageNegative implements IProcessor {

	@Override
	public BufferedImage process(BufferedImage image) { // negative 처리 요청
		// TODO Auto-generated method stub
		return negative(image);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Negative";
	}
	
	public static BufferedImage negative(BufferedImage image) { // image를 negative 처리 후 반환
		// TODO Auto-generated method stub
		
		// outImage 생성
		BufferedImage outImage = image;
	    
	    // image의 width, height를 구한다
	    int width = outImage.getWidth();
	    int height = outImage.getHeight();
	    
	    // for 문을 돌며 각 pixel을 negative 처리
	    for(int y = 0; y < height; y++){
	      for(int x = 0; x < width; x++){
	        int p = outImage.getRGB(x,y);
	        int a = (p>>24)&0xff;
	        int r = (p>>16)&0xff;
	        int g = (p>>8)&0xff;
	        int b = p&0xff;
	        //255에서 RGB를 뺀다
	        r = 255 - r;
	        g = 255 - g;
	        b = 255 - b;
	        //새로운 RGB 값 설정
	        p = (a<<24) | (r<<16) | (g<<8) | b;
	        outImage.setRGB(x, y, p);
	      }
	    }
		
		return outImage;
	}
}
