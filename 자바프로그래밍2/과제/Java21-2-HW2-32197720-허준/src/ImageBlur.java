//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageBlur implements IProcessor {

	@Override
	public BufferedImage process(BufferedImage image) { // blur 처리 호출
		// TODO Auto-generated method stub
		return Blur(image);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Blur";
	}
	
	public static BufferedImage Blur(BufferedImage image) {  // image를 blur 처리 후 반환
		// TODO Auto-generated method stub
	        Color color[];
	  
	        // input에 image 저장
	        BufferedImage input = image;
	  
	        // outImage 생성
	        BufferedImage outImage = new BufferedImage(
	            input.getWidth(), input.getHeight(),
	            BufferedImage.TYPE_INT_RGB);
	  
	        // diminsions 설정 
	        int i = 0;
	        int max = 400, rad = 10;
	        int a1 = 0, r1 = 0, g1 = 0, b1 = 0;
	        color = new Color[max];
	  
	        // for문을 돌며 각 pixel을 blur 처리
	        int x = 1, y = 1, x1, y1, d = 0;
	  
	        for (x = rad; x < input.getHeight() - rad; x++) {
	            for (y = rad; y < input.getWidth() - rad; y++) {
	                for (x1 = x - rad; x1 < x + rad; x1++) {
	                    for (y1 = y - rad; y1 < y + rad; y1++) {
	                        color[i++] = new Color(
	                            input.getRGB(y1, x1));
	                    }
	                }
	  
	                // image의 color 설정
	                i = 0;
	                for (d = 0; d < max; d++) {
	                    a1 = a1 + color[d].getAlpha();
	                }
	  
	                a1 = a1 / (max);
	                for (d = 0; d < max; d++) {
	                    r1 = r1 + color[d].getRed();
	                }
	  
	                r1 = r1 / (max);
	                for (d = 0; d < max; d++) {
	                    g1 = g1 + color[d].getGreen();
	                }
	  
	                g1 = g1 / (max);
	                for (d = 0; d < max; d++) {
	                    b1 = b1 + color[d].getBlue();
	                }
	  
	                b1 = b1 / (max);
	                int sum1 = (a1 << 24) + (r1 << 16)
	                           + (g1 << 8) + b1;
	                outImage.setRGB(y, x, (int)(sum1));
	            }
	        }
	  
		return outImage;
	}
}
