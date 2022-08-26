//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

public class ImageHorizontallyFlip implements IProcessor {

	@Override
	public BufferedImage process(BufferedImage image) { // horizontallyFlip 처리 호출
		// TODO Auto-generated method stub
		return horizontallyFlip(image);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "HorizontallyFlip";
	}
	
	public static BufferedImage horizontallyFlip(BufferedImage image) { // image를 horizontallyFlip 처리 후 반환
		// TODO Auto-generated method stub
		
		// outImage 생성
		BufferedImage outImage = image;
		
		// outImage에 horizontallyFlip 처리 된 image를 저장
		AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
		tx.translate(-outImage.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(tx,
		AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		outImage = op.filter(outImage, null);
		
		return outImage;
	}
}
