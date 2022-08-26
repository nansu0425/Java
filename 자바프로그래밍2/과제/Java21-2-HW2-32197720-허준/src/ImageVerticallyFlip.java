//Lab2_자바프로그래밍2_1분반_9월 26일_허준
import java.awt.image.BufferedImage;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

public class ImageVerticallyFlip implements IProcessor {

	@Override
	public BufferedImage process(BufferedImage image) { // verticallyFlip 처리 호출
		// TODO Auto-generated method stub
		return verticallyFlip(image);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "VerticallyFlip";
	}
	
	private BufferedImage verticallyFlip(BufferedImage image) { // image를 verticallyFlip 처리 후 반환 
		// TODO Auto-generated method stub
		
		// outImage를 생성
		BufferedImage outImage = image;
		
		// image를 verticallyFlip 처리 후 outImage에 저장
		AffineTransform tx = AffineTransform.getScaleInstance(-1, -1);
		tx.translate(-outImage.getWidth(null), -outImage.getHeight(null));
		AffineTransformOp op = new AffineTransformOp(tx,
		AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		outImage = ImageHorizontallyFlip.horizontallyFlip(op.filter(outImage, null));
		
		return outImage;
	}
}
